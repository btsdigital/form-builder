---
title: Counter
sidebar: home_sidebar
keywords: Counter
permalink: Counter.html
toc: true
folder: model
---

<strong>Дизайн на IOS 1</strong>

![Counter](images/Frame_Counter_IOS1.png "Counter")

<strong>Дизайн на IOS 2</strong>

![Counter](images/Frame_Counter_IOS2.png "Counter")


<strong>Дизайн на Android 1</strong>

![Counter](images/Frame_Counter_android1.png "Counter")

<strong>Дизайн на Android 2</strong>

![Counter](images/Frame_Counter_android2.png "Counter")

## Описание
<p>Компонент ввода пользователем числового значения путем увеличения или уменьшения текущего значения. Имеет поле с предустановленным значением (целое положительное число) от создателя бота и кнопки для увеличения или уменьшения текущего значения. Для компонента задается текстовый заголовок. Когда числовое значение достигает нуля, то кнопка для уменьшения должна становится неактивной.
</p>



|№ | Поле  | Необходимые  | Описание
|---|---|:---:|---|
|1| id | true | Уникальный идентификатор элемента  |
|2| type  | true |  Тип элемента |
|3| title  | false |  Заголовок элемента |
|4| subtitle  | false |  Подзаголовок элемента |
|5| default_value  | false |  Предустановленное значение компоненты. Может принимать ТОЛЬКО целое положительное число (min-0, max-?). Если ботописатель не указал default_value, по умолчанию ставим значение "0". В этом случае, кнопка для уменьшения значения становится неактивной |
|6| step  | false |  Устанавливает шаг приращения и уменьшения числа в default_value . Может принимать ТОЛЬКО целое положительное число (2) или дробное число (0,2). По умолчанию значение step =1, min -1 |


## Пример
```
{
   "id": "counter",
   "type": "counter",
   "title": "title",
   "default_state": true
}
```
