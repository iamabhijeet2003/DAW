<template>
  <div id="app" class="container-fluid">
    
      <div class="row">
          <div class="col-md-12">
              <h1>Profesores</h1>
          </div>
      </div>
      <div class="row">
          <div class="col-md-12">
              <formulario-persona @add-persona="agregarPersona" />
              <tabla-personas :personas="personas" @delete-persona="eliminarPersona" @actualizar-persona="actualizarPersona" />
          </div>
      </div>

      <div class="row">
        
        <div class="d-grid gap-1">
            
            <router-link to="/formulario-incidencias" class="btn btn-primary">Mostrar el formulario de de Incidencias</router-link>
        </div>
        <div class="col-md-12 mt-5">
              <h1>Incidencias</h1>
          </div>
        <router-view @add-incidencia="agregarIncidencia">
           
        </router-view>
        
        <tabla-incidencia :incidencias="incidencia" @delete-incidencia="eliminarIncidencia" @actualizar-incidencia="actualizarIncidencia" />
      

       
    </div>
  </div>
  </template>
  
  <script>
  import TablaPersonas from '@/components/TablaPersonas.vue'
  import FormularioPersona from '@/components/FormularioPersonas.vue'
  import TablaIncidencia from '@/components/TablaIncidencias.vue' 

  
  export default {
      name: 'app',
      components: {
          TablaPersonas,
          FormularioPersona,
          TablaIncidencia, 
      },
      data() {
          return {
              personas: [
                  
              ],
              incidencia:[
                
              ]
          }
      },
      created() {
        fetch("http://localhost:3000/personas")
            .then(response => response.json())
            .then(json => {
                console.log(json); 
                this.personas = json;
            })
            .catch(error => {
                console.error("Error fetching personas:", error);
            });

        fetch("http://localhost:3000/incidencia")
            .then(response => response.json())
            .then(json =>{
                console.log(json);
                this.incidencia=json;
            })

        },



      methods: {
          agregarPersona(persona) {
              let id= 0;
              
              if (this.personas.length > 0) {
                  id = this.personas[this.personas.length - 1].id + 1;
              }
              
              this.personas= [...this.personas, { ...persona, id}];
          },
          eliminarPersona(id) {
              this.personas = this.personas.filter(
                  persona => persona.id !== id
              );
          },
          actualizarPersona(id, personaActualizada) {
              this.personas = this.personas.map(persona =>
                  persona.id === id ? personaActualizada : persona
              )
          },
          agregarIncidencia(incidencia) {
            
                fetch("http://localhost:3000/incidencia", {
            method: "POST",
            body: JSON.stringify(
                incidencia
            ),
            headers: {
                "Content-type": "application/json; charset=UTF-8",
            },
        })
        .then((response) => {
            if(response.status==201){
                this.incidencia.push(incidencia)
            }
        } )
        .then(json => {
                console.log(json); 
                
            })
        
        
            },
            eliminarIncidencia(id) {
               
                this.incidencia = this.incidencia.filter(incidencia => incidencia.id != id);

                
                fetch(`http://localhost:3000/incidencia/${id}`, {
                    method: "DELETE",
                })
                .then(response => {
                   
                    if (response.ok) {
                        console.log(`Incidencia with ID ${id} deleted successfully.`);
                    } else {
                        
                        console.error(`Failed to delete Incidencia with ID ${id}.`);
                    }
                })
                .catch(error => {
                    
                    console.error("Error deleting Incidencia:", error);
                });
            },
            actualizarIncidencia(incidenciaActualizada, id) {
    
                fetch(`http://localhost:3000/incidencia/${id}`, {
                    method: "PUT",
                    body: JSON.stringify(incidenciaActualizada),
                    headers: {
                        "Content-type": "application/json; charset=UTF-8",
                    },
                })
                .then(response => {
                    
                    if (response.ok) {
                        console.log(`Incidencia with ID ${id} updated successfully.`);
                    
                        this.$emit('actualizar-incidencia', id, incidenciaActualizada);
                    } else {
                        
                        console.error(`Failed to update Incidencia with ID ${id}.`);
                    }
                })
                .catch(error => {
                    
                    console.error("Error updating Incidencia:", error);
                });
},



            
      }
  }
  </script>
  
  <style>
  body {
    background-color: #85FFBD;
    background-image: linear-gradient(45deg, #85FFBD 0%, #FFFB7D 100%);

  }
  </style>