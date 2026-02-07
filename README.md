# Item API

This repository provides an API for managing items. The API is built using **OpenAPI 3.0 (OAS 3.0)** and allows you to **add items** and **view items by ID**.

---

## Base URL

https://apis-pxvl.onrender.com


All endpoints below are relative to this base URL.

---

## API Endpoints

### 1. Add Item

**POST** `/item/add`  

Adds a new item to the system.

**Request Body:**

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "For daily use it is good",
  "price": 199999
}

````
**You get Response**

```json
{
  Entry Saved
}
````
### 2. View Item

**GET** `/item/view/{id}`

Retrieve details of an item by its ID.

**Path Parameters:**

```json
{
  "id": 1,
}

````

**You get Response**

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "For daily use it is good",
  "price": 199999
}


