
/**
 *
 * @author Karen Benedetti M
 */
public class GeneradorVertebrados {

    public static Vertebrado[] generarArrayVertebrados() {

        Vertebrado v1 = new Vertebrado("Camello", "Mamifero");
        Vertebrado v2 = new Vertebrado("Vaca", "Mamifero");
        Vertebrado v3 = new Vertebrado("Paloma", "Ave");
        Vertebrado v4 = new Vertebrado("Tiburon", "Pez");

        Vertebrado vertebradoArray[] = new Vertebrado[4];
        vertebradoArray[0] = v1;
        vertebradoArray[1] = v2;
        vertebradoArray[2] = v3;
        vertebradoArray[3] = v4;
        return vertebradoArray;
    }

}
