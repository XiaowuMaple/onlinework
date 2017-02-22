<template>
	<div id="wrapper">
		<app-header></app-header>
		<div class="main">
			<sidebar></sidebar>
			<main-content></main-content>
		</div>
	</div>
</template>

<script>
	import AppHeader from "./common/AppHeader"
	import Sidebar from "./common/Sidebar"
	import MainContent from "./common/MainContent"
	export default {
		components: {
			AppHeader,
			Sidebar,
			MainContent
		}
	}
</script>

<style scoped>
	.main { position: absolute; top: 58px; bottom: 0; left: 0; right: 0; }
</style>