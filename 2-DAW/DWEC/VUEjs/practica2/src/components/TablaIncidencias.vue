<template>
    <div id="tabla-incidencias" class="container-fluid">
      <div v-if="!incidencias.length" class="alert alert-info" role="alert">
        No se han agregado incidencias
      </div>
      <table class="table">
        <thead>
          <tr>
            <th>Aula</th>
            <th>Descripcion</th>
            <th>Nivel de Urgencia</th>
            <th>Fecha de Registro</th>
            <th>Estado</th>
            <th>Acciones</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="incidencia in incidencias" :key="incidencia.id">
            <td v-if="editando === incidencia.id">
              <input type="text" class="form-control" v-model="incidencia.aula" />
            </td>
            <td v-else>
              {{ incidencia.aula }}
            </td>
            <td v-if="editando === incidencia.id">
              <input type="text" class="form-control" v-model="incidencia.descripcion" />
            </td>
            <td v-else>
              {{ incidencia.descripcion }}
            </td>
            
            <td v-if="editando === incidencia.id">
              <select class="form-select" v-model="incidencia.nivelUrgencia">
                <option value="Urgente">Urgente</option>
                <option value="Media">Media</option>
                <option value="Baja">Baja</option>
              </select>
            </td>
            <td v-else>
              {{ incidencia.nivelUrgencia }}
            </td>
            <td v-if="editando === incidencia.id">
              <input type="date" class="form-control" v-model="incidencia.fechaRegistro" />
            </td>
            <td v-else>
              {{ incidencia.fechaRegistro }}
            </td>
            <td v-if="editando === incidencia.id">
              <input type="text" class="form-control" v-model="incidencia.estado" />
            </td>
            <td v-else>
              {{ incidencia.estado }}
            </td>
            <td>
              <button v-if="editando === incidencia.id" class="btn btn-success" @click="guardarIncidencia(incidencia)">💾 Guardar</button>
              <button v-else class="btn btn-info" @click="editarIncidencia(incidencia)">✏️ Editar</button>
              <button class="btn btn-danger ms-2" @click="$emit('delete-incidencia', incidencia.id)">🗑️ Eliminar</button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </template>
  
  <script>
  export default {
    name: 'tabla-incidencias',
    props: {
      incidencias: Array,
    },
    data() {
      return {
        editando: null,
      }
    },
    methods: {
      editarIncidencia(incidencia) {
        this.editando = incidencia.id;
      },
      guardarIncidencia(incidencia) {
        if (!incidencia.aula || !incidencia.descripcion || !incidencia.fechaRegistro) {
          return;
        }
        this.$emit('actualizar-incidencia', incidencia.id, incidencia);
        this.editando = null;
      },
    

    }
  }
  </script>
  <style scoped></style>