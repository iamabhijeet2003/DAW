<!-- App.vue -->
<template>
   <nav class="navbar navbar-expand-lg bg-primary" data-bs-theme="dark">
        <div class="container-fluid">
          
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
              <router-link to="/" class="nav-link active" >Home</router-link>
              <router-link to="/about" class="nav-link">About</router-link>
              <router-link to="/users" class="nav-link">Users</router-link>
            </div>
          </div>
        </div>
      </nav>
  <div class="container-fluid">
    <div class="row">
      <div class="col">
        <div id="app">
          <h1>Vue 3 Router Example</h1>
          <!-- Utilitza router-link per navegar entre les vistes -->
        
          <!-- Mostrem el contingut de la vista actual -->
          <router-view></router-view>
        </div>
  </div>
  </div>
  </div>  

</template>

<script>

export default {
  name: 'App',
};
</script>