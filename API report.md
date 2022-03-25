**총 로그인 수 조회 API 구현**
----
  검색 년도의 로그인 수 반환.

* **URL**

  /sqlyearStatistic/:year

* **Method:**

  `GET`
  
*  **URL Params**

   **Required:**
 
   `year=[String]`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ totcnt : CNT, year: YEAR, is_success: true }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ totCnt : -999, year: YEAR, is_success: false }`

----
  검색 월별의 로그인 수 반환.

* **URL**

  /sqlmonthStatistic/:month

* **Method:**

  `GET`
  
*  **URL Params**

   **Required:**
 
   `month=[String]`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ totcnt : CNT, month: MONTH, is_success: true }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ totCnt : -999, month: MONTH, is_success: false }`
    

----
  검색 일자별의 로그인 수 반환.

* **URL**

  /sqldayStatistic/:day

* **Method:**

  `GET`
  
*  **URL Params**

   **Required:**
 
   `day=[String]`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ totcnt : CNT, day: DAY, is_success: true }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ totCnt : -999, day: DAY, is_success: false }`
    
----
  평균 하루 로그인 수 반환.

* **URL**

  /sqlavgStatistic/

* **Method:**

  `GET`
  
*  **URL Params**

   **Required:**
 

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ AVG(CNT) : CNT, day: DAY, is_success: true }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ cnt : -999, is_success: false }`
    
----
  휴일 제외 로그인 수 반환.

* **URL**

  /sqlHolYearStatistic/:year

* **Method:**

  `GET`
  
*  **URL Params**

   **Required:**
   
   `year=[String]`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ totCount : CNT}`
    

----
  부서별 월별의 로그인 수 반환.

* **URL**

  /sqlHRmonthStatistic/:hr&month

* **Method:**

  `GET`
  
*  **URL Params**

   **Required:**
 
   `hr=[String]` & `month=[String]`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ hr: HR, month: MONTH, totcnt : CNT, is_success: true }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ totCnt : -999, hr: HR, month: MONTH, is_success: false }`
