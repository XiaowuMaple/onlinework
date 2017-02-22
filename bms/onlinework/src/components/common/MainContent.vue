<template>
	<el-col :span="20" class="main-content">
		<el-row class="content-header">
			<el-col :span="4">Go Back</el-col>
			<el-col :span="20">
				<el-row type="flex" justify="end">
					<el-breadcrumb separator="/">
						<el-breadcrumb-item :to="{ path: '/' }">home</el-breadcrumb-item>
						<el-breadcrumb-item>nav 1</el-breadcrumb-item>
						<el-breadcrumb-item>nav 2</el-breadcrumb-item>
						<el-breadcrumb-item>nav 3</el-breadcrumb-item>
					</el-breadcrumb>
				</el-row>
			</el-col>
		</el-row>
		<router-view></router-view>
	</el-col>
</template>

<style scoped>
	.main-content { background-color: #eff2f7; height: 100%; padding: 20px; overflow-y: scroll; color: black; }
	.content-header { margin-bottom: 20px; }
	.content-wrapper { background-color: #FFFFFF;}
</style>