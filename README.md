# Отчёт о тестировании приложения банковских транзаций (перевод денежных средство со счета) 

## Краткое описание

22/07/2021  было проведено тестирование приложения банковских транзакций 

На тестирование затрачено: 0.4 часа 

В результате тестирования дефектов не обнаружено.

## Описание процесса тестирования

В качестве тестовых данных использовались следующие данные: 

public class Main {
    public static void main(String[] args) {
        int account_balance = 2_000_000_000;
        int transfer_from = 500_000_000;
        int current_balance = account_balance - transfer_from;
        System.out.println(current_balance);
    }
}

Тестирование производилось в следующем окружении:
* Windows 10 Домашняя для одного языка 64 bit
* версия Java11 11.0.11
* Visual Studio Code
* IntelliJ IDEA Community Edition