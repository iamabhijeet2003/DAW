import { createRouter, createWebHistory } from 'vue-router'
import AboutView from '../views/AboutView.vue'
import HomeView from '../views/HomeView.vue'
import NotFound from '../views/NotFound.vue'
import UserView from '../views/UserView.vue'
 const routes = [
 {
     path: '/',
     name: 'home',
     component: HomeView
 },
 {
     path: '/about',
     name: 'about',
     component: AboutView
 },
 {
    path: "/:notFound",
    component: NotFound,
  },
  {
    path: "/users",
    name: 'users',
    component: UserView
  },
 ]

 const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),routes
 })

 export default router