import java.sql.SQLOutput;

public class IntOnlyArrayList {
    private int list[];

    public IntOnlyArrayList() {
        list = new int[0];
    }

    public int get(int index) {
        try {
            return list[index];

        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public void clear() {
        list = new int[0];
    }

    // todo
    // 1. Opdel originalt array i 3. En del der er mindre end index, større end index og
    // en temp variabel der indeholder værdien fra parameter index i det originale array.
    // 2. Dan nyt array og indsæt værdier samt value fra parameter på index fra parameter.
    // 3. Opdater list field med nyt array.
    public void add(int index, int value) {
        int newList[] = new int[list.length + 1];

        int position = 0;

        for(int element : list) {
            newList[position] = element;
            position = position + 1;
        }

        int temp = newList[index];
        newList[index] = value;

        newList[newList.length - 1] = temp;
    }

    // find ud af hvor stort array er
    // kopier indhold fra gammelt array
    // lav nyt array som er + 1 af arraySize og indsæt indhold fra gammelt array
    public void add(int value) {
        if(list.length == 0) {
            int newList[] = new int[list.length + 1];
            newList[0] = value;

            list = newList;

        } else {
            int newList[] = new int[list.length + 1];

            int position = 0;

            for(int element : list) {
                newList[position] = element;
                position = position + 1;
            }

            newList[position] = value;

            list = newList;
        }
    }

    // 1. Lav nyt array som er 1 mindre end list
    // 2. Kopier alle værdier fra list til nyt array som er mindre end index
    // 3. Kopier alle værdier fra list til nyt array som er større end index
    public void remove(int index) {
        int newList[] = new int[list.length - 1];

        // hvis index er 0, spring 0 over i list og kopier resten til newList
        if(index == 0) {
            for(int i = 0; i < newList.length; i++) {
                newList[i] = list[i + 1];
            }

            // ellers hvis index er over 0 og mindre end længden på listen (indenfor bounds)
            // så kopier alle værdier fra 0 og op til index
            // samt alle værdier efter index
        } else if(index > 0 && index < list.length) {
            for(int i = 0; i < index; i++) {
                newList[i] = list[i];
            }

            for(int i = index; i < newList.length; i++) {
                newList[i] = list[i + 1];
            }
        }

        list = newList;
    }

    public int size() {

        return list.length;
    }

}
