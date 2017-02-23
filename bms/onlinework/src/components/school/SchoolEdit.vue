<template>
	<el-row class="content-wrapper">
		<el-form :model="school" label-width="80px">
			<el-form-item label="名称" prop="name">
				<el-input v-model="school.name"></el-input>
			</el-form-item>
			<el-form-item label="地址" prop="address">
				<el-input v-model="school.address"></el-input>
			</el-form-item>
			<el-form-item>
				<el-button type="primary">保存</el-button>
				<el-button>取消</el-button>
			</el-form-item>
		</el-form>
	</el-row>
</template>

<script>
	import http from "../../util/http.js";
	export default {
		data() {
			return {
				school: {}
			}
		},
		methods: {
			
			
		},
		mounted() {
			
		}
	}
</script>

<style scoped>

</style>