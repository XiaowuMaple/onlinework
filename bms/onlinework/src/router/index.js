import Vue from 'vue'
import VueRouter from 'vue-router'

import Home from "components/Home"
import Login from "components/Login"
import Error404 from "components/Error404"
import Welcome from "components/Welcome"

import Form from "components/example/Form"
import Table from "components/example/Table"

import User from "components/user/userList"
import School from "components/school/schoolList"

Vue.use(VueRouter)

const routes = [
	{
		path: "/",
		component: Home,
		children: [
			{ path: "/", component: Welcome },
			{ path: "form", component: Form },
			{ path: "table", component: Table },
			{ path: "user", component: User },
			{ path: "school", component: School },
		]
	},
	{ path: "/login", component: Login },
	{ path: "/*", component: Error404 },
]

export default new VueRouter({ routes })
