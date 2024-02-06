<template>
    <div id="formulario-incidencia">
        <form @submit.prevent="enviarFormulario">
            <div class="container">
                <div class="row">

                    <div class="col-md-2">
                        <div class="form-group">
                            <label>Aula</label>
                            <input
                                ref="aula"
                                v-model="incidencia.aula"
                                type="text"
                                class="form-control"
                                :class="{ 'is-invalid': procesando && aulaInvalido }"
                                @focus="resetEstado"
                                @keypress="resetEstado"
                            />
                        </div>
                    </div>
                    <div class="col-md-2">
                        <div class="form-group">
                            <label>Descripcion</label>
                            <input
                                v-model="incidencia.descripcion" 
                                type="text"
                                class="form-control"
                                :class="{ 'is-invalid': procesando && descripcionInvalido }"
                                @focus="resetEstado"
                            />
                        </div>
                    </div>

                    <div class="col-md-2">
                        <div class="form-group">
                            <label>Nivel de urgencia</label>
                            <select 
                                
                                @change="$emit('update:nivelUrgencia', $event.target.value)"
                                class="form-select" 
                                :class="{ 'is-invalid': procesando && selectInvalido}"
                            >
                        
                                <option value="Urgente">Urgente</option>
                                <option value="Media">Media</option>
                                <option value="Baja">Baja</option>
                            </select>
                        </div>
                    </div>


                   
                    <div class="col-md-2">
                        <div class="form-group">
                            <label>Fecha de registro</label>
                            <input
                                v-model="incidencia.fechaRegistro"
                                type="date"
                                :class="{ 'is-invalid': procesando && fechaRegistroInvalido }"
                                class="form-control"
                                @focus="resetEstado"
                            />
                        </div>
                    </div>
                    <div class="col-md-2">
                        <div class="form-group">
                            <label>Estado</label>
                            <input
                                v-model="incidencia.estado"
                                type="text"
                                :class="{ 'is-invalid': procesando && estadoInvalido }"
                                class="form-control"
                                @focus="resetEstado"
                            />
                        </div>
                    </div>
                    

                </div>
                <div class="row">
                    <div class="col-md-4 mt-3">
                        <div class="form-group">
                            <button class="btn btn-primary">Añadir Incidencia</button>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div v-if="error && procesando" class="alert alert-danger" role="alert">
                            Debes rellenar todos los campos!
                        </div>
                        <div v-if="correcto" class="alert alert-success" role="alert">
                            La incidencia ha sido agregada correctamente!
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
    </template>
    
    <script>
    export default {
        name: 'formulario-incidencia',
        props: {
            nivelUrgencia: Object,
        },
        data() {
          return {
                procesando: false,
                correcto: false,
                error: false,
                incidencia: {
                aula: '',
                descripcion: '',
                nivelUrgencia: '',
                fechaRegistro:'',
                estado:'',
                }
          }
        },
        methods: {
            enviarFormulario() {
                this.procesando = true;
                this.resetEstado();
                
                // Comprobamos la presencia de errores
                if (this.aulaInvalido || this.descripcionInvalido || this.fechaRegistroInvalido || this.estadoInvalido || this.incidencia.nivelUrgencia) {
                    this.error = true;
                    return;
                }
    
                this.$emit('add-incidencia', this.incidencia);
                this.$refs.aula.focus();
    
                this.error = false;
                this.correcto = true;
                this.procesando = false;
    
                // Restablecemos el valor de la variables
                this.incidencia= {
                    aula: '',
                    descripcion: '',
                    nivelUrgencia: '',
                    fechaRegistro:'',
                    estado:'',
                }
            },
            resetEstado() {
                this.correcto = false;
                this.error = false;
            }
        },
        computed: {
            aulaInvalido() {
                return this.incidencia.aula.length < 1;
            },
            descripcionInvalido() {
                return this.incidencia.descripcion.length < 1;
            },
            fechaRegistroInvalido() {
                return this.incidencia.fechaRegistro.length < 1;
            },
            estadoInvalido(){
                return this.incidencia.estado.length<1;
            },
        },
    }
    </script>
    
    <style scoped>
    form {
        margin-bottom: 2rem;
    }
    </style>