<!-- Home.vue -->
<template>
    <div class="container">
        <div class="row">
            
            <div class="col">
            <h2>Home</h2>
            <p>Contingut de la pàgina principal</p>
        
            <!-- Afegim un botó que farà la navegació programàtica -->
            <button @click="navigateToAbout" class="btn btn-primary" type="button">Anar a About</button>
            </div>
           
        </div>
    </div>
  </template>
  
  <script>
  export default {
    methods: {
      // Mètode per fer la navegació programàtica
      navigateToAbout() {
        // Utilitzem router.push per navegar a la ruta /about
        this.$router.push('/about');
      },
    },
  };
  </script>