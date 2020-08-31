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

    public void remove(int index) {

    }

    public int size() {

        return list.length;
    }

}
