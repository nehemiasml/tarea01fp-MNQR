importar  Java . útil _ escáner ;

 clase  pública Tarea {
    Scanner  lt = nuevo  Scanner ( System . in );


    public  void  transformadas1 () {
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = cs . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = cs . siguienteInt ();            
        String [][] matriz = new  String [ dimensión ] [ dimensión ];
        for ( int  f = 0 ; f < matriz . longitud ; f ++) {
            for ( int  c = 0 ; c < matriz . longitud ; c ++) {
                si ( c < dimensión - f ){
                    matriz [ f ][ c ]= Cadena . valueOf ( valor +( f + c )*( f + c + 1 )/ 2 + f );
                }                
            }
        }
        imprimirMatriz ( matriz );
    }

    public  void  transformadas7 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingrese la dimension de la Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingrese el valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  f = 0 ; f < matriz . longitud ; f ++) {
            for ( int  c = 0 ; c <= ( matriz . longitud - 1 ) - f ; c ++) {
                matriz [ f ][ c ] = Cadena . valorDe ( valor );
                valor ++;
                
            }
            
        }
        imprimirMatriz ( matriz );
    }
    
    public  void  transformada8 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingrese la dimension de la Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingrese el valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  f = 0 ; f < matriz . longitud ; f ++) {
            for ( int  c = f ; i < matriz [ f ]. longitud ; c ++) {
                matriz [ f ][ c ] = Cadena . valorDe ( valor );
                valor ++;
                
            }
            
        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas9 () {
        sistema _ fuera _ println ( "Ingrese la dimension de la Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingrese el valor inicial:" );
         valor int = lt . siguienteInt ();
        String [][] matriz = new  String [ dimensión ] [ dimensión ];
        for ( int  f = 0 ; f < matriz . longitud ; f ++) {
            for ( int  c = ( matriz [ 0 ]. longitud - 1 ) - f ; c <= matriz [ 0 ]. longitud - 1 ; c ++ ) {
                matriz [ f ][ c ] = Cadena . valorDe ( valor );
                valor ++;
                
            }
            
        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas10 () {
        sistema _ fuera _ println ( "Ingrese dimension de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        String [][] matriz = new  String [ dimensión ] [ dimensión ];
        for ( int  i = 0 ; i < matriz . longitud ; i ++) {
            para ( int  j = 0 ; j <= yo ; j ++) {
                matriz [ i ][ i - j ] = Cadena . valorDe ( valor );
                valor ++;
                
            }
            
        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas11 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingrese la dimension de la Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingrese el valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  f = 0 ; f < matriz . longitud ; f ++) {
            for ( int  c = ( matriz . longitud - 1 ) - f ; c >= 0 ; c --) {
                matriz [ f ][ c ] = Cadena . valorDe ( valor );
                valor ++;
                
            }
            
        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas12 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingrese la dimension de la Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingrese el valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  f = 0 ; f < matriz . longitud ; f ++) {
            for ( int  c = matriz [ f ]. longitud - 1 ; c >= f ; c --) {
                matriz [ f ][ c ] = Cadena . valorDe ( valor );
                valor ++;
                
            }
            
        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas13 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingrese la dimension de la Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingrese el valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  c = 0 ; c < matriz . longitud ; c ++) {
            for ( int  f = 0 ; f <= ( matriz . longitud - 1 ) - c ; f ++) {
                
                matriz [ f ][ c ] = Cadena . valorDe ( valor );
                valor ++;
            }
            
        }
        
    }

    public  void  transformadas21 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingrese la dimension de la Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingrese el valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  c = 0 ; c < matriz [ 0 ]. longitud ; c ++) {
            si ( c % 2 == 0 ) {
                for ( int  f = 0 ; f < matriz . longitud ; f ++) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                    
                }
                
            }
            
        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas22 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  c = 0 ; c < matriz [ 0 ]. longitud ; c ++) {
            si ( c % 2 == 0 ) {
                for ( int  f = matriz . longitud - 1 ; f >= 0 ; f --) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                }
            } más {
                for ( int  f = 0 ; f < matriz . longitud ; f ++) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                }
            }

        }
        imprimirMatriz ( matriz );
    }

    public  void  transformadas23 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  c = ( matriz [ 0 ]. longitud - 1 ); c >= 0 ; c --) {
            si ( c % 2 == 0 ) {
                for ( int  f = 0 ; f < matriz . longitud ; f ++) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                }
            } más {
                for ( int  f = matriz . longitud - 1 ; f >= 0 ; f --) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                }
            }

        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas24 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  c = ( matriz [ 0 ]. longitud - 1 ); c >= 0 ; c --) {
            si ( c % 2 == 0 ) {
                for ( int  f = matriz . longitud - 1 ; f >= 0 ; f --) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                }
            } más {
                for ( int  f = 0 ; f < matriz . longitud ; f ++) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                }
            }

        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas25 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  f = 0 ; f < matriz . longitud ; f ++) {
            si ( f % 2 == 0 ) {
                for ( int  c = 0 ; c < matriz . longitud ; c ++) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                }
            } más {
                for ( int  c = matriz . longitud - 1 ; c >= 0 ; c --) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                }
            }

        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas26 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        for ( int  f = 0 ; f < matriz . longitud ; f ++) {
            si ( f % 2 == 0 ) {
                for ( int  c = matriz . longitud - 1 ; c >= 0 ; c --) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                }
            } más {
                for ( int  c = 0 ; c < matriz . longitud ; c ++) {
                    matriz [ f ][ c ] = Cadena . valorDe ( valor );
                    valor = valor + 1 ;
                }
            }

        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas27 () {
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        String [][] matriz = new  String [ dimensión ] [ dimensión ];
        for ( int  f = ( matriz . longitud - 1 ); f >= 0 ; f --) {
            si ( f % 2 == 0 ) {
                for ( int  c = ( matriz . longitud - 1 ); c >= 0 ; c --) {
                    matriz [ f ][ c ] = "" + valor ;
                    valor ++;
                }
            } más {
                for ( int  c = 0 ; c < matriz . longitud ; c ++) {
                    matriz [ f ][ c ] = "" + valor ;
                    valor ++;
                }
            }
        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas28 () {
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        String [][] matriz = new  String [ dimensión ] [ dimensión ];
        for ( int  f = ( matriz . longitud - 1 ); f >= 0 ; f --) {
            si ( f % 2 == 0 ) {
                for ( int  c = 0 ; c < matriz . longitud ; c ++) {
                    matriz [ f ][ c ] = "" + valor ;
                    valor ++;
                }
            } más {
                for ( int  c = ( matriz . longitud - 1 ); c >= 0 ; c --) {
                    matriz [ f ][ c ] = "" + valor ;
                    valor ++;
                }
            }
        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas29 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        para ( int  v = 0 ; v < dimensión / 2 ; v ++) {
            for ( int  ls = v ; ls < dimensión - 1 - v ; ls ++) {
                matriz [ v ] [ ls ] = Cadena . valorDe ( valor );
                valor ++;
            }
            for ( int  ld = v ; ld < dimensión - 1 - v ; ld ++) {
                matriz [ ld ][ dimensión - 1 - v ] = Cadena . valorDe ( valor );
                valor ++;
            }
            para ( int  lin = dimensión - 1 - v ; lin > v ; lin --) {
                matriz [ dimensión - 1 - v ] [ lin ] = Cadena . valorDe ( valor );
                valor ++;
            }
            for ( int  liz = dimensión - 1 - v ; liz > v ; liz --) {
                matriz [ liz ][ v ] = Cadena . valorDe ( valor );
                valor ++;
            }
        }
        si ( dimensión % 2 != 0 ) {
            matriz [ dimensión / 2 ][ dimensión / 2 ] = Cadena . valorDe ( valor );
        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas30 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        para ( int  v = 0 ; v < dimensión / 2 ; v ++) {
            for ( int  ld = v ; ld < dimensión - 1 - v ; ld ++) {
                matriz [ ld ][ dimensión - 1 - v ] = Cadena . valorDe ( valor );
                valor ++;
            }
            para ( int  lin = dimensión - 1 - v ; lin > v ; lin --) {
                matriz [ dimensión - 1 - v ] [ lin ] = Cadena . valorDe ( valor );
                valor ++;
            }
            for ( int  liz = dimensión - 1 - v ; liz > v ; liz --) {
                matriz [ liz ][ v ] = Cadena . valorDe ( valor );
                valor ++;
            }
            for ( int  ls = v ; ls < dimensión - 1 - v ; ls ++) {
                matriz [ v ] [ ls ] = Cadena . valorDe ( valor );
                valor ++;
            }
        }
        si ( dimensión % 2 != 0 ) {
            matriz [ dimensión / 2 ][ dimensión / 2 ] = Cadena . valorDe ( valor );
        }
        imprimirMatriz ( matriz );
        
    }

    public  void  transformadas31 () {
        Cadena [][] matriz ;
        sistema _ fuera _ println ( "Ingreso dimesion de Matriz:" );
         dimensión int = lt . siguienteInt ();
        sistema _ fuera _ println ( "Ingreso valor inicial:" );
         valor int = lt . siguienteInt ();
        matriz = new  String [ dimensión ][ dimensión ];
        para ( int  v = 0 ; v < dimensión / 2 ; v ++) {
            para ( int  lin = dimensión - 1 - v ; lin > v ; lin --) {
                matriz [ dimensión - 1 - v ] [ lin ] = Cadena . valorDe ( valor );
                valor ++;
            }
            for ( int  liz = dimensión - 1 - v ; liz > v ; liz --) {
                matriz [ liz ][ v ] = Cadena . valorDe ( valor );
                valor ++;
            }
            for ( int  ls = v ; ls < dimensión - 1 - v ; ls ++) {
                matriz [ v ] [ ls ] = Cadena . valorDe ( valor );
                valor ++;
            }
            for ( int  ld = v ; ld < dimensión - 1 - v ; ld ++) {
                matriz [ ld ][ dimensión - 1 - v ] = Cadena . valorDe ( valor );
                valor ++;
            }
        }
        si ( dimensión % 2 != 0 ) {
            matriz [ dimensión / 2 ][ dimensión / 2 ] = Cadena . valorDe ( valor );
        }
        imprimirMatriz ( matriz );
        
    }




    public  static  void  main ( String [] args ) {
        nueva  Tarea (). transformada05 ();
    }
}