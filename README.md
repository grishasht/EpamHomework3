# EpamHomework3
## Task
### Variant 8
1. Написать калькулятор, ка вход которого подается выражение вида
(1+2)*4+5*(3+6)
на выходе должно быть значение этого выражения. Использовать паттерн Composite.

2. Паттерн Abstract Factory. Разработать систему Кинопрокат. Пользователь мо
жет выбрать определенную киноленту, при заказе киноленты указывается язык 
звуковой дорожки, который совпадает с языком файла субтитров. Система 
должна поставлять фильм с требуемыми характеристиками, причем при смене 
языка звуковой дорожки должен меняться и язык файла субтитров и наоборот.

3. Паттерн  Prototype. Существует набор статей в википедии. Реализовать про -
цесс раздачи статей потребованию для изменения, сохраняя исходный ва-
риант для возможного восстановления статьи висходном виде.

4. Паттерн Factory Method. Фигуры игры «тетрис». Реализовать процесс слу-
чайного выбора фигуры из конечного набора фигур. Предусмотреть появ-
ление супер-фигур с большим числом клеток, чем обычные.

5. Паттерн Strategy. Разработать модель игровой системы. Предусмотреть наличие фентезийных персонажей: орки, тролли, пегасы, эльфы, вампиры, гарпии и др. Учесть, что некоторые персонажи ходят, другие— летают, третьи— и ходят и летают. Летать также может группа персонажей с помощью магии.

6. Паттерн Observer. Разработать систему Почтовое отделение. Из издатель-
ства в почтовое отделение поступают издаваемые газеты и журналы. 
Почтовое отделение отправляет полученные печатные издания соответст-
вующим подписчикам.

7. Паттерн State. Заказ на получение гранта для обучения может находиться в
нескольких состояниях: создан, рассматривается, отложен, отклонен, под -
твержден, отозван и т. д. Определить логику изменения состояний и разрабо-
тать модель системы

8. Паттерн Chain of responsibility. Прохождение платежа через банковскую си-
стему сопровождается целым рядом действий: фиксирующих, контролиру -
ющих, снимающих процент банка и прочие вычеты и действия. Построить 
цепочки для различного вида платежей (обычных, льготных, государствен -
ных, внутрибанковских) в соответствии с предметной областью и разрабо-
тать модель системы.

9. Паттерн Memento. Реализовать алгоритм игры «крестики-нолики». Реализовать возможность «взять назад ход»

10. Паттерн Flyweight. Разработать систему учета процессов размножения ко-
лонии бактерий. Существует модель системы Рецепт. Модель позволяет в неизменяемом виде хранить назначения врача и срок действия рецепта. Написать код приложения, позволяющий продлевать срок действия уже существующего рецепта. Выберите подходящий паттерн для реализации этого задания

11. Вариант в этой задаче выбирать согласно правилу (номер_студента_в_списке % 15). Выполнить только один вариант
В каждом из предложенных вариантов требуется при помощи  Rational Rose построить модель программного обеспечения.
При проектировании системы требуется:
- создать иерархию классов системы;

- построить диаграммы классов системы, отображающие связи между классами;

### 8. Таксофон

Требуется разработать средствами Rational Rose модель встроенной
системы управления работой таксофона городской телефонной сети. Таксофон предназначен для оказания платных услуг телефонной
связи. Он подключен к линии связи. В нем имеется кнопочная панель,
дисплей, трубка со встроенным микрофоном и громкоговорителем,
приемник карт – устройство для считывания телефонных карт,
используемых для оплаты разговора. В начальном состоянии трубка таксофона повешена, дисплей потушен, таксофон не реагирует на нажатия кнопок и какие-либо сигналы из линии. При снятии трубки таксофон выдает на дисплей сообщение «Вставьте карту» и ожидает, когда пользователь вставит карту в приемник. Дальнейшее  функционирование таксофона осуществляется только при вставленной карте. Если карту вынимают, таксофон возвращается к началу и выдает сообщение  о необходимости вставить карту. При  попадании карты в приемник  производится считывание информации с карты. Если кредит исчерпан или карта не пригодна (не удается узнать кредит), то таксофон выдает соответствующее сообщение на дисплей таксофона. Если карта может быть использована для оплаты, то на дисплей выдается количество «единиц» на карте, и на телефонную станцию (АТС) подается сигнал «Трубка». При получении ответного сигнала «Тон» из линии таксофон воспроизводит звуковой тон «Готов» (длинный непрекращающийся гудок) в трубку. При получении сигнала «Занято», в трубке воспроизводится тон «Занято» (короткие гудки). 
После получения от АТС сигнала «Тон» от пользователя
принимаются семизначный номер вызываемого абонента, остальные нажатия на кнопки игнорируются. Когда пользователь нажимает на кнопку с цифрой соответствующий ей сигнал «Цифра» передается АТС. Во время набора номера введенные цифры отображаются на дисплее. В ответ на набранный номер от АТС приходит либо сигнал «Занято», либо сигнал «Вызов». При получении сигнала «Вызов» таксофон воспроизводит в трубку длинные гудки до того момента, когда АТС осуществит коммутацию и передаст сигнал «Данные». Таксофон воспроизводит данные, передаваемые с сигналом, в трубку. При получении данных из трубки, аппарат преобразует их в сигнал «Данные» и передает их АТС. Во время разговора на дисплее ведется отсчет времени и уменьшается кредит на телефонной карте – каждые 15 секунд вычитается четверть «единицы». Обмен данными прерывается, в следующих случаях:

    – исчерпан кредит;
    – карта вынута из приемника;
    – от АТС пришел сигнал «Занято»;
    – повешена трубка таксофона.
    
Если трубка была повешена, аппарат посылает в линию сигнал
«Конец» и выдает на дисплей сообщение «Выньте карту».
После извлечения карты из приемника таксофон переходит в начальное
состояние.