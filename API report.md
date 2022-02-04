**총 로그인 수 조회 API 구현**
----
  검색 년도의 로그인 수 반환.

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
    **Content:** `{ error : "찾으려는 년도가 너무 큽니다." }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "요청에 대한 권한이 없습니다." }`

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