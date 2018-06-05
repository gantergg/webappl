import service.MedService;
import model.Med;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaTranzaction{


    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaTranzaction");
        EntityManager em = emf.createEntityManager();
        MedService service = new MedService(em);

        System.out.println("Создание и сохранение медикамента");
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Med med = service.createMed(1, "ppapap", 25);
        transaction.commit();
        System.out.println(String.format("Сохранено: %s\n", med));

        System.out.println("--- Поиск медикамента ---");
        med = service.findMed(1);
        System.out.println(String.format("Found: %s\n", med));

        System.out.println("--- Поиск всех медикаментов ---");
        List<Med> meds = service.findAllMed();
        for (Med foundMed : meds) {
            System.out.println(String.format("Найдено: %s\n", foundMed));
        }

        System.out.println("--- Изменение медикаментов ---");
        transaction.begin();
        med = service.changeMedPrice(1, 5);
        transaction.commit();
        System.out.println(String.format("Изменено: %s\n", med));


       /* System.out.println("--- Удаление медикаментов ---");
        transaction.begin();
        service.removeMed(1);
        transaction.commit();
        med = service.findMed(1);
        System.out.println(String.format("Найдено: %s\n", med)); */
    }
}
