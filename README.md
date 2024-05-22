# jv-pecs

1. У вас есть абстрактный класс Machine и три подкласса: Bulldozer, Excavator и Truck. Не стесняйтесь добавлять в эти классы поля, специфичные для типа.

2. Каждая машина имеет возможность начать работу.

3. Создан интерфейс MachineProducer.
Целью реализации этого интерфейса является создание списка определенных машин (Bulldozer, Excavator и Truck).
У вас должно быть как минимум 3 реализации: BulldozerProducer, ExcavatorProducer, TruckProducer.
Параметризуйте ваш MachineProducer и замените Object в get() на подходящий вариант.
    ```java
    public interface MachineProducer<PARAMETRIZE ME>{ ... }
    ```
4. В реализациях MachineProducer ваш метод get() должен возвращать список определенных машин.
   Например:
    ```java
    List<Bulldozer> get();
    ```
    или 
    ```java
    List<Truck> get();
    ```
    или 
    ```java
    List<Excavator> get();
    ```

5. Также создан интерфейс MachineService. Вам нужно его параметризовать и заменить Object в сигнатуре метода на правильный вариант (используйте PECS):

- метод getAll(Class type) создает список машин на основе входного параметра.
- метод fill(List<Object> machines, Object value) заполняет список машин переданным значением.
- метод startWorking() должен принимать список, содержащий любую машину.
- Когда вы параметризуете интерфейс MachineService, помните, что мы хотим ограничить типы, которые могут быть использованы с ним.

Не допускается:

~~`MachineServiceImpl implements MachineService<Dog>`~~  

  Допускается:

`MachineServiceImpl implements MachineService<Truck>`  

1. Используйте созданный класс MachineServiceImpl, реализующий MachineService, и реализуйте эти методы:
- getAll(Class type) - на основе входного типа класса выберите правильную реализацию MachineProducer и вызовите его метод get().

Например: if (type == Bulldozer.class) - мы должны вызвать метод get() из правильной реализации MachineProducer (той, которая вернет List<Bulldozer>) и вернуть эти машины.
- `fill(List<Object> machines, Object value)` - обновите все элементы в списке machines до переданного значения (которое может быть любого подтипа `Machine`).

- `startWorking()` - вызовите `doWork` на каждой машине в списке.

#### [Try to avoid these common mistakes while solving task](./checklist.md)
