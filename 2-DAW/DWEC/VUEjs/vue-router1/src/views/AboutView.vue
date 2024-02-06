<!-- About.vue -->
<template>
    <div class="container">
        <div class="row">
            
            <div class="col">
            <h2>About</h2>
            <p>Contingut de la pàgina de about</p>
        
            <!-- Afegim un botó que farà la navegació programàtica -->
            <button @click="navigateToHome" class="btn btn-primary" type="button">Anar a Home</button>
            </div>
           
        </div>
    </div>
  </template>

<script>
export default {
  methods: {
    // Mètode per fer la navegació programàtica
    navigateToHome() {
      // Utilitzem router.push per navegar a la ruta /about
      this.$router.push('/');
    },
  },
};
</script>