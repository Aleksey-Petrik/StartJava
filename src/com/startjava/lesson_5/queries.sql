SELECT * FROM jaegers; --Вся таблица

SELECT * FROM jaegers WHERE status = 'Worker'; --Только рабочие роботы

SELECT * FROM jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-5'; --Определенный тип

SELECT * FROM jaegers ORDER BY mark DESC; --Сортировка по типу

SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers); --Самый старый робот

SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers) OR kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers); --Роботы которые набили самое большое и меньшее количество

SELECT * FROM jaegers WHERE kaijuKill > (SELECT AVG(kaijuKill) FROM Jaegers); --Роботы которые набили выше среднего
SELECT * FROM jaegers WHERE kaijuKill < (SELECT AVG(kaijuKill) FROM Jaegers); --Роботы которые набили самое ниже среднего

SELECT AVG(weight) FROM Jaegers; --Средний вес

SELECT * FROM jaegers WHERE status = 'Worker'; --до прибавления
UPDATE jaegers SET kaijuKill = kaijuKill + '1' WHERE status = 'Worker'; --Рабочим роботам добавим по одно убийству
SELECT * FROM jaegers WHERE status = 'Worker'; --после прибавления

DELETE FROM jaegers WHERE status = 'Destroyed'; --Удаление уничтоженых роботов
SELECT * FROM jaegers; --Вся таблица