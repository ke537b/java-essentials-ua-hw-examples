Використовуючи IntelliJ IDEA, створіть проект. 
Потрібно: Створити клас Game. 
У тілі класу створіть три методи getBasicLoot(), getExtendedLoot(), getDeluxeLoot(). 
У тілі кожного з методів додайте виведення на екран відповідних рядків: "Loot collected", 
"Extended loot available in extended edition", "Deluxe loot available in extended edition". 
Створіть похідний клас ExtendedEdition. 
Перевизначте відповідні методи, при перевизначенні методів виводьте наступні рядки: "Rare loot collected", 
"Deluxe loot preview. To collect deluxe loot get deluxe edition". 
Створіть похідний клас DeluxeEdition від базового класу ExtendedEdition. 
Перевизначте відповідний метод. При викликі даного методу необхідно виводити на екран "Deluxe loot collected". 
У тілі методу main() реалізуйте можливість прийому від користувача номер ключа доступу extended і deluxe. 
Якщо користувач не вводить ключ, він може користуватися тільки безкоштовною версією (створюється екземпляр базового класу), 
якщо користувач ввів номери ключа доступу pro і exp, то повинен створити екземпляр відповідної версії класу, наведений до базового – Game.