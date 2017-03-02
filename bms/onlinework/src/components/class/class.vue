<template>
	<div class="myclass">
	<!--搜索框-->
		<el-form :inline="true" :model="formInline" class="demo-form-inline">
		  <el-form-item label="班级名称:">
		    <el-input v-model="formInline.className" placeholder="班级名称"></el-input>
		  </el-form-item>
		    <el-button type="primary" @click="onSubmit">查询</el-button>
		  </el-form-item>
		</el-form>
		<!--搜索框完-->
		<el-table
    :data="tableData"
    highlight-current-row
    border
    @current-change="handleCurrentChange"
    style="width: 100%">
    <el-table-column
      type="index"
      width="400">
    </el-table-column>
    <el-table-column
      property="date"
      label="日期"
      width="120">
    </el-table-column>
    <el-table-column
      property="name"
      label="姓名"
      width="130">
    </el-table-column>
    <el-table-column
      property="address"
      label="地址">
    </el-table-column>
  </el-table>
	</div>
</template>
<script>
	export default {
		data:function(){
			return {
				formInline:{
					className:""
				},
				tableData: [{
		          date: '2016-05-02',
		          name: '王小虎',
		          address: '上海市普陀区金沙江路 1518 弄'
		        }, {
		          date: '2016-05-04',
		          name: '王小虎',
		          address: '上海市普陀区金沙江路 1517 弄'
		        }, {
		          date: '2016-05-01',
		          name: '王小虎',
		          address: '上海市普陀区金沙江路 1519 弄'
		        }, {
		          date: '2016-05-03',
		          name: '王小虎',
		          address: '上海市普陀区金沙江路 1516 弄'
		        }]
			}
		},
		methods:{
			onSubmit(){

			}
		}
	}
</script>
<style scoped>
.myclass{
	background-color: #EFF2F7;
}	
</style>