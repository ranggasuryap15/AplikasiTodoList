public class TambahTodoList extends App{
//    private String todo;
//    private boolean isFull;
//
//    TambahTodoList(String todo, boolean isFull){
//        this.todo = todo;
//        this.isFull = isFull;
//    }

    public void addTodoList(String todo) {
        // cek apakah model/data arraynya sudah penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                // masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh kita resize ukuran Array dua kali lipat
        if (isFull) {
            var temp = model; // agar data sebelumnya tidak hilang, data yang lama ini kita taruh di variabel temporary
            model = new String[model.length * 2]; // kalo tanpa variabel temp, maka data array sebelumnya akan hilang

            // untuk memindahkan temporary ke model lagi
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // 1. tambahkan ke posisi yang data Array nya null
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo; // todo diambil dari parameter diatas
                break; // setelah selesai menambahkan, maka diselesaikan
            }
        }
    }

    public void viewAddTodoList() {
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x jika Batal)"); // info si input

        if (todo.equals("x")) {
            // batal
        } else {
            addTodoList(todo);
        }
    }
}
