<template>
	<el-row class="content-wrapper">
		<!-- toolbar -->
		<el-col :span="24" class="toolbar">
			<el-form inline>
				<el-form-item>
					<el-input v-model="keyword" placeholder="keyword"></el-input>
				</el-form-item>
				<el-form-item>
					<el-button>查询</el-button>
				</el-form-item>
				<el-form-item>
					<el-button @click="edit">新增</el-button>
				</el-form-item>
			</el-form>
		</el-col>
		
		<!-- table -->
		<el-table :data="data.content">
			<el-table-column prop="name" label="Name"></el-table-column>
			<el-table-column prop="address" label="Address"></el-table-column>
			<el-table-column inline-template label="Operate" min-width="144">
				<div>
			        <el-button size="small" type="text" @click="edit(row.id)">编辑</el-button>
			        <el-button size="small" type="text" @click="del(row.id)">删除</el-button>
		      	</div>
			</el-table-column>
		</el-table>
		
		<!-- pagination -->
		<div class="pagination">
			<el-pagination
				:current-page="pageNum"
				:page-size="pageSize"
				:total="data.totalElements"
				@current-change="pageChange"></el-pagination>
		</div>
		
			
		<!-- edit modal -->
		<el-dialog title="学校信息编辑" v-model="editable">
			<el-form :model="school" label-width="80px">
				<el-form-item label="名称" prop="name">
					<el-input v-model="school.name"></el-input>
				</el-form-item>
				<el-form-item label="地址" prop="address">
					<el-input v-model="school.address"></el-input>
				</el-form-item>
			</el-form>
			<div slot="footer" class="dialog-footer">
			    <el-button @click="editable = false">取 消</el-button>
			    <el-button type="primary" @click="save">保存</el-button>
			</div>
		</el-dialog>
	</el-row>
</template>

<script>
	import http from "../../util/http.js";
	
	export default {
		data() {
			return {
				data: {},
				keyword: "",
				pageNum: 1,
				pageSize: 10,
				editable: false,
				school: {},
			}
		},
		methods: {
			findAll(pageNum = this.pageNum, pageSize = this.pageSize) {
				let url = "school/findAll";
				http.post(url, { pageNum, pageSize }, response => {
					this.data = response;
					this.pageNum = pageNum;
				});
			},
			pageChange(pageNum) {
				this.findAll(pageNum);
			},
			edit(id) {
				if(id) {
					let url = "school/get";
					http.post(url, { id }, response => {
						this.school = response;
						this.editable = true;
					});
				} else {
					this.school = {};
					this.editable = true;
				}
				
			},
			del(id) {
				let url = "school/delete";
				http.post(url, { id }, response => {
					this.$message({ message: "操作成功", type: "success" });
					this.findAll();
				});
			},
			save() {
				let url = "school/save";
				http.post(url, this.school, response => {
					this.$message({ message: "操作成功", type: "success" });
					this.findAll();
					this.editable = false;
				});
			}

		},
		mounted() {
			this.findAll();
		}
	}
</script>

<style scoped>
	.toolbar .el-form-item {
		margin-bottom: 10px;
	}
	.toolbar {
		background: #fff;
		padding: 10px 10px 0px 10px;
	}
	.pagination {
		overflow: auto;
		margin: 10px;
	}
	.pagination>.el-pagination{
/*		text-align: center;*/
		float: right;
	}
	.el-dialog .el-form>.el-form-item:last-child{
		margin-bottom: 0;
	}
</style>