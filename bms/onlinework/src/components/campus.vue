<template>
	<el-row class="campus" :span="24">
		<el-col>
			 <el-tabs type="card" active-name="second">
			    <el-tab-pane label="年级管理" name="first">
			    	<my-grades></my-grades>
			    </el-tab-pane>
			    <el-tab-pane label="班级管理" name="second">
			    	<my-class></my-class>
			    </el-tab-pane>
			    <el-tab-pane label="学生管理" name="third">
			    	<my-students></my-students>
			    </el-tab-pane>
			  </el-tabs>
		</el-col>
	</el-row>
</template>
<script>
	import myClass from "./class/class.vue";
	import myGrades from "./grades/grades.vue";
	import myStudents from "./students/students.vue";
	export default {
		name:"campus",
		components:{myClass,myGrades,myStudents},
		data:function(){
			return{
				activeName2: 'third'
			}
		},
		methods:{
		}
	}
</script>
<style scoped>
.campus{
	/* background-color:green; */
}
</style>