package org.example.jUnit_app.exemples.models;


import org.example.excepcions.saldoNegatiu;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class CompteTest {

    Compte compte;


    @BeforeAll
    static void beforeAll() {
        System.out.println("Iniciant els casos de prova.");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Finalizant els casos de prova.");
    }

    @BeforeEach
    void initMetodeTest(){
        this.compte = new Compte("ES4612341234567890123456","Sergi", new BigDecimal("3000.30203"));
        System.out.println("Iniciant el metode.");
    }


    @AfterEach
    void afterCadaMetode(){
        System.out.println("Finalizant metode de prova.");
    }



    @Nested
    class testComptesBancari{
        Compte compte;
        @BeforeEach
        void initMetodeTest(){
            this.compte = new Compte("ES4612341234567890123456","Sergi", new BigDecimal("3000.30203"));
            System.out.println("Iniciant el metode.");
        }
        @Test
        @DisplayName("Prova del nom del compte")
        void  testNomCompte(TestInfo testInfo, TestReporter testReport) {

            System.out.println("Executem " + testInfo.getDisplayName() + " " + testInfo.getTestMethod().get().getName());

            //Compte compteTest = new Compte("Sergi", new BigDecimal(3000.30203));
            //compteTest.setPersona("Sergi");
            String valorEsperat = "Sergi";
            String valorReal = this.compte.getPersona();
            assertNotNull(valorReal,()->"El compte bancari no pot ser null.");


            assertEquals(valorEsperat,valorReal,()->"El nom del compte no es el que esperavem.");
            assertTrue(valorReal.equals("Sergi"));
        }

        @Test
        @DisplayName("Prova del saldo del compte")
        void testSaldoCompte() {
            //Compte compte = new Compte( "Sergi", new BigDecimal(3000.30203));
            assertEquals(3000.30203, compte.getSaldo().doubleValue());
            assertFalse(compte.getSaldo().compareTo(BigDecimal.ZERO)<0);
            assertTrue(compte.getSaldo().compareTo(BigDecimal.ZERO)>0);
        }

        @Test
        @DisplayName("Prova de la comparacio del compte")
        void compararComptes() {
            Compte compte = new Compte("ES4612341234567890123456" ,"Pere", new BigDecimal("3333.9090"));
            Compte compte2 = new Compte("ES4612341234567890123456", "Pere", new BigDecimal ( "3333.9090")) ;

            //assertNotEquals (compte2 , compte);
            assertEquals(compte2,compte);

        }


        @Test
        @DisplayName("Prova de carrec del compte")
        void testCarrecCompte() {
            Compte compte = new Compte("ES4612341234567890123456","Pau", new BigDecimal("1234.5678"));
            compte.carrec(new BigDecimal("100"));
            assertNotNull(compte.getSaldo());
            assertEquals(new BigDecimal("1134.5678"), compte.getSaldo());

        }

        @Test
        @DisplayName("Prova de abonament del compte")
        void testAbonamentCompte() {
            Compte compte = new Compte("ES4612341234567890123456","David", new BigDecimal("1234.5678"));
            compte.abonament(new BigDecimal("100"));
            assertNotNull(compte.getSaldo());
            assertEquals(new BigDecimal("1334.5678"), compte.getSaldo());

        }

        @Test
        @DisplayName("Prova del saldo negatiu del compte")
        void saldoNegatiu() {
            Compte compte = new Compte("ES4612341234567890123456","David", new BigDecimal("1000.12345"));
            Exception exception = assertThrows(saldoNegatiu.class,()->{
                compte.carrec(new BigDecimal("1500"));
            });

            String messageException = exception.getMessage();
            String messageEsperat = "Saldo Negatiu";
            assertEquals(messageEsperat,messageException);
        }

        @Test
        @DisplayName("Prova de tranferacio del diners als altres comptes")
        void testTransferirDinersComptes() {
            Compte compte1 = new Compte("ES4643211234567890123456","David",new BigDecimal("2500.54321"));
            Compte compte2 = new Compte("ES4643211234567890654321","Andreu",new BigDecimal("1000.12345"));

            Banc banc = new Banc();
            banc.setNom("Banc panchicha");
            banc.transferir(compte1,compte2,new BigDecimal("1000"));

            assertEquals(new BigDecimal("1500.54321"), compte1.getSaldo());
            assertEquals(new BigDecimal("2000.12345"), compte2.getSaldo());
        }

    }






    @Test
    @Disabled
    @DisplayName("Proves Varies")
    void testComptesBancs() {
        Compte compte1 = new Compte("ES4612341234567890123456","David",new BigDecimal("2500.54321"));
        Compte compte2 = new Compte("ES4612341234567890654321","Andreu",new BigDecimal("1000.12345"));

        Banc banc = new Banc();
        banc.setNom("Banc Santander");

        banc.setCompte_llista(compte1);
        banc.setCompte_llista(compte2);

        banc.transferir(compte1,compte2,new BigDecimal("1000"));

        assertAll(
                ()->{assertEquals(new BigDecimal("1500.54321"), compte1.getSaldo(),
                    ()->"El saldo no es el esperat.");},
                ()->{assertEquals(new BigDecimal("2000.12345"), compte2.getSaldo(),
                        ()->"El saldo no es el esperat.");},
                ()->{assertEquals(2,banc.getLlistat_Comptes().size(),
                        ()->"El numero de compte de la llista no es correcte.");},
                ()->{ assertEquals("Banc Santander",compte1.getBanc().getNom(),
                        ()->"El nom del banc no es correcte.");},
                ()->{assertTrue(banc.getLlistat_Comptes().stream().anyMatch(c -> c.getPersona().equals("Andreu")));}
        );


    }




@Nested
    class  testSistemaOperatiu {
        @Test
        @EnabledOnOs(OS.WINDOWS)
        void testNomesWindows() {
            System.out.println("No se ejecutara");
        }

        @Test
        @EnabledOnOs({OS.LINUX, OS.MAC})
        void testNomesLinuxMac() {
            System.out.println("Se ejecutara");
        }

        @Test
        @DisabledOnOs({OS.LINUX, OS.MAC})
        void testNomesLinuxMacDis(){
            System.out.println("No se ejecutara.");
        }
    }

    @Nested
    class testVersioJava{
        @Test
        @EnabledOnJre(JRE.JAVA_8)
        void nomesJava8() {
            System.out.println("Nomes en Java8");
        }

        @Test
        @EnabledOnJre(JRE.JAVA_19)
        void imprimirSystemProperties(){
            Properties properties = System.getProperties();
            properties.forEach((k,v)-> System.out.println(k + ":"+ v));
        }
    }

    @Nested
    class testVariablesEntorn{
        @Test
        void imprimirVariablesEntorn() {
            Map<String, String> getEnv = System.getenv();
            getEnv.forEach((k,v)-> System.out.println(k + " " + v));

        }

        @Test
        @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = "*.jdk-19*.*")
        void testJavaHome() {
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "4")
        void testProcesadorHome() {
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "ENVIRONMENT", matches = "dev")
        void testEnv() {
        }

        @Test
        @DisabledIfEnvironmentVariable(named = "ENVIRONMENT", matches = "prod")
        void testDisabledProd() {
        }
    }



    @Test
    @DisplayName("Prova del saldo del compte")
    void testSaldoCompteDev() {
        boolean esDev = "dev".equals(System.getProperty("ENV"));
        assumeTrue(esDev );

        assertEquals(3000.30203, compte.getSaldo().doubleValue());
        assertFalse(compte.getSaldo().compareTo(BigDecimal.ZERO)<0);
        assertTrue(compte.getSaldo().compareTo(BigDecimal.ZERO)>0);
    }


    @RepeatedTest(value = 5, name = "Repeticion numero {currentRepetition} de {totalRepetitions}")
    @DisplayName("Prova de carrec del compte repetida")
    void testCarrecCompte(RepetitionInfo info ) {

        if (info.getCurrentRepetition()==3){
            System.out.println("Es la repeticion tres.");
        }
        Compte compte = new Compte("ES4612341234567890123456","Pau", new BigDecimal("1234.5678"));
        compte.carrec(new BigDecimal("100"));
        assertNotNull(compte.getSaldo());
        assertEquals(new BigDecimal("1134.5678"), compte.getSaldo());

    }


@Nested
@Tag("param")
    class testParametritzat {


        @ParameterizedTest
        @ValueSource(strings = {"100", "200", "300", "400", "500", "600", "700", "800", "900", "1000"})
        void testCarrecCompteParametritzat(String valor) {

            compte.carrec(new BigDecimal(valor));
            assertNotNull(compte.getSaldo());
            System.out.println("Vamos a hacer un cargo de : " + valor);
            System.out.println("En la cuenta quedan " + compte.getSaldo());
            assertTrue(compte.getSaldo().compareTo(BigDecimal.ZERO) > 0);

        }


        @ParameterizedTest
        @CsvFileSource(resources = "/data.csv")
            //{"1,100","2,200","3,300","4,400","5,500","6,600","7,700","8,800","9,900", "10,4000"}
        void testCSVCarrecCompteParametritzat(String saldo, String valor) {

            compte.setSaldo(new BigDecimal(saldo));
            compte.carrec(new BigDecimal(valor));
            assertNotNull(compte.getSaldo());
            System.out.println(saldo + "Vamos a hacer un cargo de : " + valor);
            System.out.println("En la cuenta quedan " + compte.getSaldo());
            assertTrue(compte.getSaldo().compareTo(BigDecimal.ZERO) > 0);

        }

        @ParameterizedTest
        @MethodSource("valorList")
            //{"1,100","2,200","3,300","4,400","5,500","6,600","7,700","8,800","9,900", "10,4000"}
        void testMethodCarrecCompteParametritzat(String valor) {

            compte.carrec(new BigDecimal(valor));
            assertNotNull(compte.getSaldo());
            System.out.println("Vamos a hacer un cargo de : " + valor);
            System.out.println("En la cuenta quedan " + compte.getSaldo());
            assertTrue(compte.getSaldo().compareTo(BigDecimal.ZERO) > 0);

        }


        private static @NotNull List<String> valorList() {
            List<String> llista = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                llista.add(String.valueOf(Math.random() * 1000));
            }
            return llista;
        }

    }





    //A partir de aqui vamos a hacer las pruebas unitarias pedidas en AULES.


    @Nested
    class pruebasUnitariasPedidasEnAules {
        @Test
        @DisplayName("Prueba de nº de cuenta no nula")
        void testNumeroCuentaNoNula() {

            String numeroCompte = "12345678";
            String nom = "Abhijeet Singh";
            BigDecimal saldo = new BigDecimal("1000.0");
            Compte compte = new Compte(numeroCompte, nom, saldo);

            assertNotNull(compte.getNumero());
        }


        @Test
        @DisplayName("Prueba de la misma entidad")
        void testMismaEntidad() {
            //PARA "BANCO SANTANDER" HE USADO LA ENTIDAD Nª 1234 (ES46-1234-***************)
            //PARA "BANC PACHICHA" HE USADO LA ENTIDAD Nª 4321 en la prueba- testTransferirDinersComptes()
            Compte compte1 = new Compte("ES4612341234567890123456", "Abhijeet Singh", new BigDecimal("1000"));
            Compte compte2 = new Compte("ES4612341234567890654321", "Miguel Gea", new BigDecimal("1500"));
            assertEquals(compte1.getNumero().substring(4, 8), compte2.getNumero().substring(4, 8));
        }

        @Test
        @DisplayName("Prueba de Cuenta Unica")
        void testNumeroDeCuentaUnica() {
            Compte compte1 = new Compte("ES4612341234567890123456", "Abhijeet Singh", new BigDecimal("1000"));
            Compte compte2 = new Compte("ES4612341234567890654321", "Miguel Gea ", new BigDecimal("1500"));
            assertNotEquals(compte1.getNumero(), compte2.getNumero());
        }

        @Test
        @DisplayName("Prueba de Cuenta valida")
        void testNumeroDeCuentaValida() {
            Compte compte1 = new Compte("ES4612341234567890123456", "Abhijeet Singh", new BigDecimal("1000"));
            assertEquals(24, compte1.getNumero().length());
        }

    }
}