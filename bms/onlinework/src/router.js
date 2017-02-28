import Vue from 'vue'
import VueRouter from 'vue-router'

import Home from "components/Home"
import Login from "components/Login"
import Error404 from "components/Error404"
import Welcome from "components/Welcome"

import School from "components/School"

Vue.use(VueRouter)

const routes = [
	{
		path: "/",
		component: Home,
		children: [
			{ path: "/", component: Welcome },
			{ path: "school", component: School },
		]
	},
	{ path: "/login", component: Login },
	{ path: "/*", component: Error404 },
]

export default new VueRouter({ routes })
