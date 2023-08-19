# logical-services

tech stack
- java 17
- spring boot

jawaban untuk nomor 3 : 
Kompleksitas waktu dari implementasi di atas adalah O(n), di mana n adalah panjang dari string input. 
Ini karena kita hanya melakukan iterasi sekali pada setiap karakter dalam string input. 
Kompleksitas ruang adalah O(n) juga karena dalam kasus terburuk kita mungkin harus menyimpan setengah dari karakter input dalam stack.

cara menjalankan dengan crul
1. curl -X POST -H "Content-Type: application/json" -d '{"input":"abbcccd", "queries":[1, 3, 9, 8]}' http://localhost:8080/api/v1/logics/weighted

2. curl -X POST -H "Content-Type: application/json" -d '{"input":"3943", "k":1}' http://localhost:8080/api/v1/logics/palindrome

3. curl -X POST -H "Content-Type: application/json" -d '{"input":"{ [ ( ) ] }"}' http://localhost:8080/api/v1/logics/balanced-brackets
4. curl -X POST -H "Content-Type: application/json" -d '{"input":"{ [ ( ] ) }"}' http://localhost:8080/api/v1/logics/balanced-brackets
5. curl -X POST -H "Content-Type: application/json" -d '{"input":"{ ( ( [ ] ) [ ] ) [ ] }"}' http://localhost:8080/api/v1/logics/balanced-brackets

result 
1. ![image](https://github.com/adriansyahdicky/logical-services/assets/54537198/2775a61c-e908-402d-8977-21bd1d56249b)
2. ![image](https://github.com/adriansyahdicky/logical-services/assets/54537198/73d9d04c-5a82-4759-b95f-6246f617cf5e)
3. ![image](https://github.com/adriansyahdicky/logical-services/assets/54537198/fb90bb85-eb27-4d0f-96b7-2b4980d9a19f)
4. ![image](https://github.com/adriansyahdicky/logical-services/assets/54537198/368c8b7f-b3be-44b3-b27e-14456daf71c3)
5. ![image](https://github.com/adriansyahdicky/logical-services/assets/54537198/c1cb149b-06c8-45dc-af51-c81afe091d35)




