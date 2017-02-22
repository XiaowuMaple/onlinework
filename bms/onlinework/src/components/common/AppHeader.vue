<template>
	<div class="header">
		<el-col :span="4">
			<h2 class="head-title">Admin</h2>
		</el-col>
		<el-col :span="20">
			<el-col :span="2" :offset="22" class="login-out">
				<span>login out</span>
			</el-col>
		</el-col>
	</div>
</template>

<style scoped>
	.header { color: #FFFFFF; height: 58px; }
	.head-title { margin: 15px 43px; }
	.header>div { height: 100%; }
	.login-out{ text-align: center; padding-top: 15px; cursor: pointer; }
</style>