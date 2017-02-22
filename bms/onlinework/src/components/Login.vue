<template>
	<div class="wrapper">
		<el-form :model="user" :rules="loginRules" ref="user">
			<h3 class="title">Login</h3>
			<el-form-item prop="account">
				<el-input v-model="user.account" placeholder="account"></el-input>
			</el-form-item>
			<el-form-item prop="password">
				<el-input v-model="user.password" type="password" placeholder="password"></el-input>
			</el-form-item>
			<el-form-item>
				<el-checkbox v-model="user.rememberPassword">remember password</el-checkbox>
			</el-form-item>
			<el-form-item>
				<el-button class="btn-login" type="primary" @click.prevent="login">login</el-button>
			</el-form-item>
		</el-form>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				user: {},
				loginRules: {
					account: [
						{ required: true, message: "please enter the account", trigger: "blur" },
					],
					password: [
						{ required: true, message: "please enter the password", trigger: "blur" }
					]
				}
			}
		},
		methods: {
			login() {
				this.$refs.user.validate(result => {
					if(result) {
						
					}
				})
			}
		}
	}
</script>

<style scoped>
	.wrapper {
		width: 350px;
		padding: 35px;
		background-color: #FFFFFF;
		margin: 150px auto;
		border: 2px solid #8492A6;
		border-radius: 5px;
	}
	.title {
		margin: 0px auto 40px auto;
	    text-align: center;
	    color: #505458;
	}
	.btn-login {
		width: 100%;
	}
</style>