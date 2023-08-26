/*Создать класс BankAccount, который представляет банковский счет.
Каждый банковский счет имеет уникальный номер и баланс.
Класс BankAccount должен содержать внутренний класс Transaction, который представляет транзакцию на счете.
Внутренний класс Transaction должен иметь методы для записи депозита и снятия средств с баланса,
 а также для получения информации о текущем балансе.
 */

package hometasks.velimovich.les7.a3;

import java.util.Scanner;

public class BankAccount {

        private int id;
        private double balance;

        public BankAccount( int id, double balance){
            this.id = id;
            this.balance = balance;
        }

        class Transaction {

            public void deposit() {
                System.out.println("Введите сумму депозита");
                Scanner scan = new Scanner(System.in);
                double depos = scan.nextDouble();
                balance += depos;
            }
        }

        void withdrawals () {
            System.out.println("Введите сумму снятия");
            Scanner scan = new Scanner(System.in);
            double withdraw = scan.nextDouble();
            balance -= withdraw;

        }

        void getInfo () {
            System.out.println("Текущий баланс " + balance);
        }

    }