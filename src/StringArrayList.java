public class StringArrayList {
    private String[] data = new String[0];

    public void add(String val) {
        String[] newarr = new String[data.length + 1];
        System.arraycopy(data, 0, newarr, 0, data.length);
        newarr[data.length] = val;
        data = newarr;
    }

    public boolean insert(int index, String val) {
        if (index < 0 || index > data.length) return false;
        if (index == data.length) {
            add(val);
            return true;
        }
        String[] newarr = new String[data.length + 1];
        if (index > 0)
            System.arraycopy(data, 0, newarr, 0, index);
        newarr[index] = val;
        System.arraycopy(data, index, newarr, index + 1, data.length - index);
        data = newarr;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= data.length) return false;
        String[] newarr = new String[data.length - 1];
        if (index > 0) {
            System.arraycopy(data, 0, newarr, 0, index);
        }
        if (index < data.length - 1)
            System.arraycopy(data, index + 1, newarr, index, data.length - index - 1);
        data = newarr;
        return true;
    }

    public String get(int index) {
        if (index >= 0 && index < data.length)
            return data[index];
        return null;
    }

    public boolean set(int index, String val) {
        if (index >= 0 && index < data.length) {
            data[index] = val;
            return true;
        }
        return false;
    }

    public boolean contains(String val) {
        return (indexOf(val) >= 0);
    }

    public int indexOf(String val) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(val))
                return i;
        }
        return -1;
    }

    public int size() {
        return data.length;
    }

    public void println() {
        for (String a : data)
            System.out.print(" " + a);
        System.out.println("");
    }
}
