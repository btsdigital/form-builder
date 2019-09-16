---
title: Catalog
sidebar: home_sidebar
keywords: Catalog
permalink: Catalog.html
toc: true
folder: model
---
<strong>Дизайн на IOS</strong>

![Catalog](images/SimpleCatalogIOS.png "Catalog")

<strong>Дизайн на Android</strong>

![Catalog](images/simplecatalogAndroid.png "Catalog")

## Описание
<p>Элемент на форме, который вызывает backdrop со списком значений для выбора.
</p>

| Поле  | Необходимые  | Описание
|---|:---:|---|
| id | true | Уникальный идентификатор формы  |
| type  | true |  Тип элемента |
| title  | false |  Заголовок элемента |
| placeholder  | true |  Подсказка пользователю |
| catalog  | true |  Описание и настройки формы, которую необходимо открыть, по нажатию на компонент |
| catalog.options  | true |  Объект опций каталога |
| catalog.options.title  | true |  Заголовок используется для компонента Catalog, что бы установить текст в шапке формы |
| options.search_enabled  | false |  Флаг для отображения компонента поиска по списку значений каталога, по умолчанию false |
| catalog.items  | true |  Массив элементов списка, ниже представлен минимальный набор данных необходимый для построения элемента списка |
| catalog.items[n].id  | true |  Уникальный идентификатор элемента |
| catalog.items[n].title  | true |  Заголовок элемента(Основной текст) |
| catalog.items[n].description  | false |  Описание элемента |
| file_metadata  | false |  Информация о файле |
| file_type  | true |  Тип файла |
| file_id  | true |   Уникальный идентификатор файла |
| file_name  | true |  Имя файла |
| validations_rules  | false |  Правила валидации поля |
| default_value  | false |  Предустановленное значение, любое из catalog.items[n] |

## Пример
```
{
  "id": "catalog_id",
  "type": "catalog",
  "title": "Title",
  "placeholder": "placeholder",
  "default_value": {},
  "validations_rules": [],
  "catalog": {
    "options": {
      "title": "title",
      "search_enabled": false
    },
    "items": [
      {
        "id": "",
        "title": "",
        "description": "",
        "file_metadata": {
          "file_type": "image",
          "file_id": "fileId",
          "filename": "fileName"
        }
      }
    ]
  }
}
```
