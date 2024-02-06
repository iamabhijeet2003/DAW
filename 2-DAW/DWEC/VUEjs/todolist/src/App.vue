<template>
  <div>
    <LlistatTasques :tasques="tasques" @EliminarTasca="EliminarTasca"/>
    <TascaADD :NovaTasca="NovaTasca" @AfegirTasca="AfegirTasca" />
   
  </div>
</template>

<script>
import LlistatTasques from './components/LlistatTasques.vue';
import TascaADD from './components/TascaADD.vue';


export default {

  name: 'App',
  components: {
    LlistatTasques,
    TascaADD,
  
    
  },
  data(){
    return{
      tasques:[]
    }
  },
  created(){
    this.tasques = [
      {
        id:1,
        text:"hola",
        insercion: new Date().toDateString(),
        completada:true,
        dataCompletada: null,
        prioritat:1
      },
      {
        id:2,
        text:"hola 2",
        insercion:new Date().toDateString(),
        completada:false,
        dataCompletada: null,
        prioritat:3
      },
      {
        id:3,
        text:"hola 3",
        insercion:new Date().toDateString(),
        completada:true,
        dataCompletada: null,
        prioritat:2
      }
      ]
    },
    methods:{
      
      EliminarTasca(tasca) {
    this.tasques = this.tasques.filter(t => t.id !== tasca.id);
    },
   
    AfegirTasca(tasca) {
      let id= 0;
              
      if (this.tasques.length > 0) {
          id = this.tasques[this.tasques.length - 1].id + 1;
      }
      this.tasques= [...this.tasques, { ...tasca, id}];
      //this.tasques = [...this.tasques, tasca];
      
    }
    }
 }

</script>

<style>

</style>
