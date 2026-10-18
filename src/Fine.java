import java.time.LocalDate;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class Fine {
    issuanceRepository issRep = new issuanceRepository();

    private static int ID = 1; //Привязан к пользователю увеличивается на 1 если появляется пользователь у которого нет штрафов в списке
    private int userID;
    private int literatureID;

    Fine(int userID, int literatureID){
        this.userID = userID;
        this.literatureID = literatureID;
    }

    private void dailyCheck(){
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Код, который нужно выполнять каждый день
                for(Map.Entry<Integer, issuanceRepository> entry: issRep.borrows.entrySet()){
                    Integer ID = entry.getKey();
                    issuanceRepository issRep = entry.getValue();

                    if(issRep.getFineDay() == LocalDate.now()){
                        issRep.getUserID();// записывать его
                    }
                }//поменять
            }
        };

        long delay = 0; // запуск сразу
        long interval = 24 * 60 * 60 * 1000L; // 24 часа в миллисекундах

        timer.scheduleAtFixedRate(task, delay, interval);
    }
    //Штрафы пользователя
//id Фамилия Имя(кол-во книг выданных/ просроченных):(просроченные книги)
//      1. id выдачи| Дата выдачи| Дата окончания | Сколько дней просрочено| Штраф в день| Общий штраф по книге
//      2. То же самое если несколько книг
//  Штраф в день:
//  Общий накопленный штраф:
//Следующий пользователь

    //книга и выдача попадает в просроченные если дата окончания выдачи раньше сегодняшней даты
    //добавить дату с которой отсчитывается штраф
    //Если пользователь вернул книгу штраф висит, но не капает
    //Штраф удаляется из хранилища когда пользователь погашает и вносит нужную стоимость, можно погасить часть задолжности



}