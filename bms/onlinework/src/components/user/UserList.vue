<template>
	<el-row class="content-wrapper">
		<!-- toolbar -->
		<el-col :span="24" class="toolbar">
			<el-form inline>
				<el-form-item>
					<el-input v-model="keyword" placeholder="keyword"></el-input>
				</el-form-item>
				<el-form-item>
					<el-button>Find</el-button>
				</el-form-item>
				<el-form-item>
					<el-button>Add</el-button>
				</el-form-item>
				<el-form-item>
					<el-button>Delete</el-button>
				</el-form-item>
			</el-form>
		</el-col>
		
		<!-- table -->
		<el-table :data="list">
			<el-table-column prop="name" label="Name"></el-table-column>
			<el-table-column prop="sex" label="Sex"></el-table-column>
			<el-table-column prop="birthday" label="Birthday"></el-table-column>
			<el-table-column prop="mobile" label="Mobile"></el-table-column>
			<el-table-column prop="email" label="Email"></el-table-column>
			<el-table-column inline-template label="Operate" min-width="144">
				<div>
			        <el-button size="small" type="text" @click="handleEdit(row)">edit</el-button>
			        <el-button size="small" type="text" @click="handleDelete(row.id)">delete</el-button>
		      	</div>
			</el-table-column>
		</el-table>
	</el-row>
</template>

<script>
	import http from "../../util/http.js";
	export default {
		data() {
			return {
				list: [],
				keyword: ""
			}
		},
		methods: {
			findAll() {
				let url = "user/findAll";
				http.post(url, {}, response => {
					this.list = response;
				})
			},
			handleEdit(row) {
				console.log(row);
			},
			handleDelete(row) {
				console.log(row);
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
</style>