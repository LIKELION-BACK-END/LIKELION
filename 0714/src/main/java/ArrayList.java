class ArrayList {
    private Object[] datas;
    private int size;

    ArrayList() {
        datas = new Object[2];
        size = 0;
    }

    Integer get(int index) {
        return (Integer) datas[index];
    }

    void removeAt(int index) {
        for (int i = index + 1; i < size; i++) {
            datas[i - 1] = datas[i];
        }
        size--;
    }

    private void extendToDataSizeIfNeedToAdd() {
        boolean needToExtend = size >= datas.length;

        if (needToExtend) {
            Object[] newDatas = new Object[datas.length * 2];

            for (int i = 0; i < datas.length; i++) {
                newDatas[i] = datas[i];
            }

            System.out.println("배열의 크기가 증가되었습니다. " + datas.length + " => " + newDatas);

            datas = newDatas;
        }
    }

    void add(int data) {
        add(data, size);
    }

    void add(int data, int indexToAdd) {
        extendToDataSizeIfNeedToAdd();

        for (int i = size; i > indexToAdd; i--) {
            datas[i] = datas[i - 1];
        }

        datas[indexToAdd] = data;
        size++;
    }

    int size() {
        return size;
    }

    void showAllValues() {
        System.out.println("-- 전체 데이터 출력 --");
        for (int i = 0; i < size; i++) {
            System.out.print(i + " : ");
            System.out.println(datas[i]);
        }
    }
}
