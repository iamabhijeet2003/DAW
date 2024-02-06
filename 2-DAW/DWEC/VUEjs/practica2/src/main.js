
import { createApp } from 'vue';
import { createRouter, createWebHistory } from 'vue-router';
import App from './App.vue';
import FormularioIncidencias from './components/FormularioIncidencias.vue'; // Import the FormularioIncidencias component

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/formulario-incidencias', component: FormularioIncidencias },
    
    // Define the route for FormularioIncidencias
    // Add more routes as needed
  ],
});

const app = createApp(App);
app.use(router);
app.mount('#app');
