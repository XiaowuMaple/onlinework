<template>
	<el-col :span="4" class="slidebar">
		<el-menu theme="dark" router>
			<el-menu-item index="/"><i class="el-icon-setting"></i>Home</el-menu-item>
	      	<!--<el-submenu index="1">
	        	<template slot="title"><i class="el-icon-message"></i>Example</template>
	          	<el-menu-item index="/table">Table</el-menu-item>
	          	<el-menu-item index="/form">Form</el-menu-item>
	      	</el-submenu>-->
	     	<el-menu-item index="/school"><i class="el-icon-setting"></i>School</el-menu-item>
	    </el-menu>
	</el-col>
</template>

<style scoped>
	.slidebar { height: 100%; border-top: 1px solid #475669; }
</style>