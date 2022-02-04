**�� �α��� �� ��ȸ API ����**
----
  �˻� �⵵�� �α��� �� ��ȯ.

* **URL**

  /login/:year

* **Method:**

  `GET`
  
*  **URL Params**

   **Required:**
 
   `year=[integer]`

* **Data Params**

  None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ year : 2020, cnt : 20 }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "ã������ �⵵�� �ʹ� Ů�ϴ�." }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "��û�� ���� ������ �����ϴ�." }`

* **Sample Call:**

  ```javascript
    $.ajax({
      url: "/login/2020",
      dataType: "json",
      type : "GET",
      success : function(r) {
        console.log(r);
      }
    });
  ```