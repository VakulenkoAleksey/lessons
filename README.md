### [Ссылка на обратную связь по дз на время перерыва](https://docs.google.com/spreadsheets/d/15GH_OaIsZJf09O1_cefLnBjrr5SS602nOUr4ccGALjg/edit#gid=0)
    
Занятие 1:
1. [Типы данных](src/lesson1/FirstLesson.java) 
2. Операторы 

Занятие 2:
1. [Конструкции ветвления](src/lesson2/Conditions.java)
2. [Циклы](src/lesson2/Loops.java)

Занятие 3:
1. [Массивы](src/lesson2/ArraysLesson.java)

#### Обязательные задачи:
##### Если в задании указано "из случайных чисел", значит нужно использовать Math.random()
1. Найти наибольший общий делитель (НОД) двух чисел
2. Дан массив целых чисел.
   Массив не отсортирован, числа могут повторяться.
   Необходимо найти в данном массиве такие два числа n и m, чтобы их сумма была равна 7.
   Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7. Постарайтесь решить задачу наиболее оптимальным способом
3. Заполните массив на N элементов случайным числами и выведете максимальное, минимальное и среднее значение.
4. Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n. 
Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод. 
Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. 
Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его в консоль
5. Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести массив в консоль. 
   После на отдельной строке вывести в консоль значение максимального элемента этого массива.
   
#### Дополнительные задачи:
1. [Ветвления и циклы](simple-tasks.txt)
2. [Массивы](arrays-task.txt)

Занятие 4:
1. [Git](git-commands.md)

Занятие 5:
1. [Строки](src/lesson5/StringLesson.java)

#### Задачи на строки 
##### Обязательно решить любые 3 (остальные - дополнительные)
1. Даны 2 слова, состоящие из четного числа букв. 
Получить слово состоящее из первой половины первого слова и второй половины второго слова.
2. Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
3. Имеются две строки. Найти количество вхождений одной строки в другую.
4. Написать функцию, которая проверяет, является ли строка палиндромом. Палиндром — это слово или фраза, которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.
5. Даны два слова и словарь (массив слов). Необходимо найти алгоритм превращения в другое, меняя за один шаг одну букву, причем каждое новое слово должно быть в словаре (массиве слов).
Например,даны слова "hit" и "cog" и словарь(массив слов) ["hot", "dot", "dog", "log", "lot"]. 
Один из вариантов цепочки: "hit"->"hot"->"dot"->"dog"->"cog".
6. Пользователь вводит названия городов через пробел. Вы их присваиваете переменной. Переставьте названия так, чтобы они были упорядочены по алфавиту.

Занятие 6:
1. [Классы и Объекты](src/ru/ifmo/base/lesson6)

#### Необязательные задачи на синтакисис:
1. Создать фигуры: Circle, Rectangle, Triangle, у которых должны быть координаты. Все фигуры должны иметь методы, которые возвращают площадь и периметр (для окружности - длина окружности).
2. Создать класс Cat со следующими свойствами:

        1. имя
        2. имя, вес, возраст
        3. имя, возраст
        4. вес, цвет 
        5. вес, цвет, адрес владельца 
        6. количество здоровья (тип int)
        7. сила удара (тип int)
        
        Создать 5 разных конструкторов.
        Создать соответствующие сеттеры и геттеры.
        Создать метод, который выводит полную информацию о коте.
                
        Реализовать метод void fight(Cat anotherCat) -  механизм битвы котов: количество здоровья кота уменьшается на силу удара противника (anotherCat)
        Если у кота не осталось очков здоровья, выводить информацию, что он пока не может драться
        
        Создать не менее 5 объектов (использовать разные конструкторы). 

[Занятие 7](src/ru/ifmo/base/lesson7):
1. Наследование
2. Абстрактные классы  
3. Интерфейсы

Занятие 8:
1. [FINAL и STATIC](src/ru/ifmo/base/lesson8) 

Задача "Школа":
        
        Класс Ученик 
        создается со следующими характеристиками:
            имя (тип String)
            возраст (тип int)
            изучаемый предмет (тип String)
            уровень знаний (тип int)
        и методом:
            учиться() - уровень знаний ученика повышается
        
        Класс Учитель 
        создается со следующими харатеристиками:
            имя (тип String)
            возраст (тип int)
            преподаваемый предмет (тип String)
        и методом:
            учить(обучаемый) - тип данных обучаемого определить самостоятельно
        
        Класс Директор 
        создается со следующими харатеристиками:
            имя (тип String)
            возраст (тип int)
        и методами:
            объявить начало занятий()
            объявить окончание занятий занятий()
        
        Класс Школа
        создается со следующими харатеристиками:
            название - задается при создании объекта и не может быть изменено в последствии
            директор - школа не может функционировать без директора
            учителя[] - массив
            ученики[] - массив
        и методом:
            день в школе() - 
                1. директор объявляет начало занятий
                2. учителя учат учеников (предмет учителя и ученика должны совпадать)
                3. директор объявляет окончание занятий
        
        Методы учить() и учиться() необходимо описать в разных интерфейсах
        Общие свойства необходимо вынести в родительские классы (какие определить самостоятельно)
        В классах можно добавлять свои методы и свойства 
        
        
#### [Контрольная по классам и объектам - файл exam-farm.txt](exam-farm.txt)

#### [Задача по классам и объектам Фитнес](fitness-task.txt)

#### [Доп задача на классы и объекты - Альпинисты](climbers.txt)
#### [Доп задача на наследование и интерфейсы - Конвертер температур](converter.txt)

#### [Список задач на дату и время](datetime-tasks.txt)

#### [Задача Морской бой](sea-battle.txt)

Пробное занятие
[Обертки над примитивами](src/ru/ifmo/base/testlesson) 

