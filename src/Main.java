import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cash = 0.00d;
        int pinCode = 1111;
        boolean upperRunnung = true;
        while (upperRunnung) {
            System.out.println(STR."Эскертуу, катасы жок ПИН код жазыныз, болбосо эсеп боготтолот!");
            System.out.print(STR."Пин код жазыныз: ");
            int buttonForPinCode = new Scanner(System.in).nextInt();
            if (buttonForPinCode == pinCode) {
                boolean upperCycle = true;
                LOOP2:
                while (upperCycle) {
                    System.out.println(STR."тилдерди танданыз: ");
                    System.out.println(STR."1. Кыргыз тили: ");
                    System.out.println(STR."2. Русский язык: ");
                    System.out.println(STR."3. English language: ");
                    System.out.println(STR."4. Системадан чыгуу: ");
                    System.out.print(STR."Тандоонузду киргизиниз: ");
                    int buttonForLanguage = new Scanner(System.in).nextInt();
                    switch (buttonForLanguage) {
                        case 1:
                            boolean running = true;
                            while (running) {
                                System.out.println(STR."1. Балансты текшеруу: ");
                                System.out.println(STR."2. Депозиттик акча: ");
                                System.out.println(STR."3. Накталай акчаа алуу: ");
                                System.out.println(STR."4. Пин код озгортуу: ");
                                System.out.println(STR."5. тил тандоо менюсуна өтүңүз: ");
                                System.out.print(STR."Тандоонузду киргизиниз: ");
                                int buttonForMenu = scanner.nextInt();
                                switch (buttonForMenu) {
                                    case 1:
                                        System.out.println(STR. "Сиздин балансыныз: $\{ cash }" );
                                        break;
                                    case 2:
                                        System.out.print(STR."Депозитке сумманы киргизиниз: ");
                                        double depozitMoney = scanner.nextDouble();
                                        if (depozitMoney > 0) {
                                            cash += depozitMoney;
                                            System.out.println(STR. "$\{ depozitMoney } сиздин эсебинизге салынды." );
                                        } else {
                                            System.out.println(STR."Жараксыз сумма.");
                                        }
                                        break;
                                    case 3:
                                        System.out.print(STR."Алынуучу сумманы киргизиниз: ");
                                        double withdrawMoney = scanner.nextDouble();
                                        if (withdrawMoney > 0 && withdrawMoney <= cash) {
                                            cash -= withdrawMoney;
                                            System.out.println(STR. "$\{ withdrawMoney } эсебинизден чыгарылды." );
                                        } else {
                                            System.out.println(STR."Баланс жетишсиз. жарактуу сумманы киргизиниз.");
                                        }
                                        break;
                                    case 4:
                                        System.out.print(STR."Жаны пин код жазыныз: ");
                                        int newPinCode = new Scanner(System.in).nextInt();
                                        if (newPinCode == pinCode) {
                                            System.out.println(STR."Башка пин код жазыныз.");
                                        } else {
                                            pinCode = newPinCode;
                                            System.out.println(STR."Сиз пин кодту ийгиликтүү өзгөрттунуз!!!");
                                            break LOOP2;
                                        }
                                        break;
                                    case 5:
                                        System.out.println(STR."Кунунуз маанайлуу отсун.");
                                        running = false;
                                        break;
                                    default:
                                        System.out.println(STR."Жарамсыз тандоо. Тандоонузду текшерип, кайра киргизиниз.");
                                }
                            }
                            break;
                        case 2:
                            boolean repetition = true;
                            while (repetition) {
                                System.out.println(STR."1. Проверка счета: ");
                                System.out.println(STR."2. Внесение денег: ");
                                System.out.println(STR."3. Снятие наличных: ");
                                System.out.println(STR."4. Изменить пин код: ");
                                System.out.println(STR."5. перейти в меню выбора языка: ");
                                System.out.print(STR."Введите свой выбор: ");
                                int buttonForMenuRuss = scanner.nextInt();
                                switch (buttonForMenuRuss) {
                                    case 1:
                                        System.out.println(STR. "Ваш баланс: $\{ cash }" );
                                        break;
                                    case 2:
                                        System.out.print(STR."Введите сумму для депозита: ");
                                        double depozitMoney = scanner.nextDouble();
                                        if (depozitMoney > 0) {
                                            cash += depozitMoney;
                                            System.out.println(STR. "$\{ depozitMoney } внесено в ваш счет." );
                                        } else {
                                            System.out.println(STR."Недействительная сумма.");
                                        }
                                        break;
                                    case 3:
                                        System.out.print(STR."Введите сумму для снятие: ");
                                        double withdrawMoney = scanner.nextDouble();
                                        if (withdrawMoney > 0 && withdrawMoney <= cash) {
                                            cash -= withdrawMoney;
                                            System.out.println(STR. "$\{ withdrawMoney } снято с вашего счета." );
                                        } else {
                                            System.out.println(STR."Недостаточно баланса. введите действительную сумму.");
                                        }
                                        break;
                                    case 4:
                                        System.out.print(STR."Введите новый пин код: ");
                                        int newPinCode = new Scanner(System.in).nextInt();
                                        if (newPinCode == pinCode) {
                                            System.out.println(STR."Введите другой пин код.");
                                        } else {
                                            pinCode += newPinCode;
                                            System.out.println(STR."Вы успешно изменили пин код!!!");
                                        }
                                        break;
                                    case 5:
                                        System.out.println(STR."Хорошего вам дня.");
                                        repetition = false;
                                        break;
                                    default:
                                        System.out.println(STR."Неподходящий выбор. Проверьте свой выбор и введите его снова.");
                                }
                            }
                            break;
                        case 3:
                            boolean cycleFOrEnglish = true;
                            while (cycleFOrEnglish) {
                                System.out.println(STR."1. Checking the account: ");
                                System.out.println(STR."2. Depositing money: ");
                                System.out.println(STR."3. Cash withdrawal: ");
                                System.out.println(STR."4. Change pin code: ");
                                System.out.println(STR."5. go to the language selection menu ");
                                System.out.print(STR."Enter your choice: ");
                                int buttonForMenuEng = scanner.nextInt();
                                switch (buttonForMenuEng) {
                                    case 1:
                                        System.out.println(STR. "Your balance: $\{ cash }" );
                                        break;
                                    case 2:
                                        System.out.print(STR."Enter the amount for the deposit: ");
                                        double depozitMoney = scanner.nextDouble();
                                        if (depozitMoney > 0) {
                                            cash += depozitMoney;
                                            System.out.println(STR. "$\{ depozitMoney } added to your account." );
                                        } else {
                                            System.out.println(STR."Invalid amount.");
                                        }
                                        break;
                                    case 3:
                                        System.out.print(STR."Enter the withdrawal amount: ");
                                        double withdrawMoney = scanner.nextDouble();
                                        if (withdrawMoney > 0 && withdrawMoney <= cash) {
                                            cash -= withdrawMoney;
                                            System.out.println(STR. "$\{ withdrawMoney } withdrawn from your account." );
                                        } else {
                                            System.out.println(STR."Not enough balance. enter a valid amount.");
                                        }
                                        break;
                                    case 4:
                                        System.out.print(STR."Enter a new PIN code: ");
                                        int newPinCode = new Scanner(System.in).nextInt();
                                        if (newPinCode == pinCode) {
                                            System.out.println(STR."Enter another PIN code.");
                                        } else {
                                            pinCode += newPinCode;
                                            System.out.println(STR."You have successfully changed the PIN code!!!");
                                        }
                                        break;
                                    case 5:
                                        System.out.println(STR."Have a nice day.");
                                        cycleFOrEnglish = false;
                                        break;
                                    default:
                                        System.out.println(STR."The wrong choice. Check your selection and enter it againll.");
                                }
                            }
                            break;
                        case 4:
                            System.out.println(STR."Кунунуз маанайлуу отсун.");
                            upperCycle = false;
                            break;
                        default:
                            System.out.println(STR."Жарамсыз тандоо. Тандоонузду текшерип, кайра киргизиниз.");
                    }
                }
                break;
            } else {
                System.out.println(STR."жараксыз пин код. Каттоо эсебиңиз бөгөттөлдү.");
                upperRunnung = false;
            }
        }
    }
}
