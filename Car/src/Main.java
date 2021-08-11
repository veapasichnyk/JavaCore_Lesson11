import java.util.*;

public class Main {

    static void menu ( ) {
        System.out.println ( "Enter 1 to display an array of random cars" );
        System.out.println ( "Enter 2 to fill the array with the same values for a random car" );
    }

    public static void main ( String[] args ) {

        Scanner        scanner           = new Scanner ( System.in );
        RandomOfValue  random            = new RandomOfValue ( );
        MaterialOfHelm materialOfHelms[] = MaterialOfHelm.values ( );

        while (true) {
            menu ( );

            switch (scanner.nextInt ( )) {

                case 1: {
                    Car carArray[][] = new Car[ random.getRandom ( 1 , 10 ) ][ random.getRandom ( 1 , 10 ) ];

                    for ( int i = 0 ; i < carArray.length ; i++ ) {
                        for ( int j = 0 ; j < carArray[ i ].length ; j++ ) {
                            carArray[ i ][ j ] = new Car ( random.getRandom ( 65 , 210 ) , random.getRandom ( 2010 , 2021 ) ,
                                                           new Engine ( random.getRandom ( 2 , 16 ) ) ,
                                                           new Helm ( random.getRandom ( 37 , 39 ) ,
                                                                      materialOfHelms[ random.getRandom ( 0 , materialOfHelms.length - 1 ) ] )
                            );
                        }
                    }
                    System.out.println ( Arrays.deepToString ( carArray ) );

                    break;
                }

                case 2: {
                    Car car = new Car ( random.getRandom ( 65 , 210 ) , random.getRandom ( 2010 , 2021 ) ,
                                        new Engine ( random.getRandom ( 2 , 16 ) ) ,
                                        new Helm ( random.getRandom ( 37 , 39 ) ,
                                                   materialOfHelms[ random.getRandom ( 0 , materialOfHelms.length - 1 ) ] )
                    );

                    Car carArray[] = new Car[ random.getRandom ( 1 , 10 ) ];

                    Arrays.fill ( carArray , car );
                    System.out.println ( Arrays.deepToString ( carArray ) );

                    break;
                }
                default: {
                    System.out.println ( "The entered number must be 1 or 2" );

                    break;
                }
            }

        }
    }
}
