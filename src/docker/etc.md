## docker-compose


### 작성 예

```yaml
version: '3''
  
  nginx:
    container_name: 'nginx'
    image: 'nginx:latest'
    depends_on:
      - gitlab
      - jenkins
    ports:
      - '80:80'
      - '443:443'
    volumes:
      - ./nginx:/etc/nginx/conf.d
      - ./data/certbot/conf:/etc/letsencrypt
      - ./data/certbot/www:/var/www/certbot
      - /etc/letsencrypt/ssl-dhparams.pem:/etc/letsencrypt/ssl-dhparams.pem
    networks:
      - gitlab_network
    command: "/bin/sh -c 'while :; do sleep 6h & wait $${!}; nginx -s reload; done & nginx -g \"daemon off;\"'"
```

### service

`docker-compose` **파일 형식의 버전**을 나타낸다.

### container_name

`컨테이너`의 이름을 지정, **Docker가 생성하는 기본 이름 대신 이 이름이 사용됨**.

### image

사용할 Docker의 이미지를 지정, 여기서는 Docker Hub에서 최신 버전의 nginx 이미지를 사용하도록 지정

### depends_on

이 서비스가 시작되기 전에 시작되어야 하는 다른 서비스를 나열

### ports

호스트 머신의 포트를 컨테이너 포트에 매핑

여기서는 호스트의 80번 포트를 컨테이너 80, 443번 포트를 443에 매핑

:(콜론)을 기준으로 왼쪽이 `호스트 머신의 포트` 오른쪽이 `컨테이너의 포트`를 나타냄

