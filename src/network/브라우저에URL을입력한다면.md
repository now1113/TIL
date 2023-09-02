# 브라우저 주소창에 www.test.com을 입력하면

1. 먼저 **hosts**파일을 확인해서 www.test.com에 대한 IP 주소를 확인한다.

    ```plantuml
    192.168.0.1 www.test.com
    ```
    이런식으로 해당 도메인의 IP는 무엇인지 기술 되어있는 파일이다.
    
    특별히 수정해주지 않는 이상은 비어있는 파일이다.


2. hosts파일이 비어있다면 DNS 캐시(메모리)를 확인한다.

    
3. DNS Cache(메모리)에도 정보가 없다면 DNS Query (여기까지가 해당 도메인에 IP 주소를 얻는 과정)


4. IP주소를 획득했다면 브라우저가 해당 서버에 TCP/IP 연결


5. 브라우저가 서버에 HTTP Request 요청


6. 서버에서 브라우저에게 HTTP Response 반환


# 용어 설명

## DNS(Domain Name System)

DNS는 사람이 읽을 수 있는 도메인(www.test.com)을 머신이 읽을 수 있는 IP주소(192.168.90.1)로 변환한다.

DNS의 주요 목적은 사람들이 쉽게 사이트 주소를 찾을 수 있도록 도와주는 것이다.

만약 DNS가 없다면 사람들은 www.test.com이 아닌 192.168.90.1로 ip주소를 외워서 사이트에 접속해야 할 것이다.

