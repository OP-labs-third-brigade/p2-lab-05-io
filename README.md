# p2-lab-05-io

- Завдання має бути реалізовано як окремий клас. 
- Клас має складатись щонайменше з таких методів:
- public static void main(String[] agrs) - точка входу. 
- Метод, що реалізує задане завдання. Метод має перевіряти аргументи та у разі їх помилковості аварійно закінчувати свою роботу шляхом викидання стандартного виключення IllegalArgumentException або NullPointerException. В разі неможливості виконання операції, метод повинен викидати IOException або FileNotFoundException. В жодному разі цей метод не повинен напряму взаємодіяти з користувачем через консоль або інший UI (ніколи не змішуйте бізнес-логіку та користувацький інтерфейс). 
	- Клас може містити інші допоміжні методи. 
	- При виконанні завдань слід звернути увагу на ефективність з точки зору швидкодії:
- операції вводу/виводу слід здійснювати через буфер;
- програму потрібно написати так, щоб зчитування кожного фрагмента файлу здійснювалось лише один раз (тобто від початку файлу до кінця за один прохід без повторного зчитування).

*Щоб результат коректно відображався в консолі, може знадобитись прописати там "chcp 65001"