<script>
    export default{
        props:["PrioritatInicial"],
        data(){
            return{
                PrioritatActual:this.PrioritatInicial,
            }
        },

        methods:{
            assignarPrioritat(NovaPrioritat){
                this.PrioritatActual = NovaPrioritat
                this.$emit("actualizar-prioridad", NovaPrioritat);
            }
            
        }
    
    }
</script>

<template>
        <div>
            <span style="color: green" @click="assignarPrioritat(1)">
                <i v-if="PrioritatActual==1" class="bi bi-1-circle-fill"></i>
                <i v-else class="bi bi-0-circle-fill"></i>
            </span>
            <span style="color: green" @click="assignarPrioritat(2)">
                <i v-if="PrioritatActual==2" class="bi bi-2-circle-fill"></i>
                <i v-else class="bi bi-0-circle-fill"></i>
            </span>
            <span style="color: green" @click="assignarPrioritat(3)">
                <i v-if="PrioritatActual==3" class="bi bi-3-circle-fill"></i>
                <i v-else class="bi bi-0-circle-fill"></i>
            </span>
        </div>
</template>
