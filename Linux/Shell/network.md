### network bandwidth speed
iftop 
or
curl -s https://raw.githubusercontent.com/sivel/speedtest-cli/master/speedtest.py | python -

### curl use socks5 proxy
curl -x socks5h://127.0.0.1:10036 http://www.google.com/

### curl with data
curl --request POST --data '{"params":""}' http://127.0.0.1:7777/search
curl http://*****/file  -O   or -o fileB

### open port to one specific ip
firewall-cmd --permanent --add-rich-rule="rule family="ipv4" source address="1.1.1.1" port protocol="tcp" port="8888" accept"

firewall-cmd --permanent --remove-rich-rule="rule family="ipv4" source address="192.168.11.151" port protocol="tcp" port="8887" accept"

firewall-cmd --reload
firewall-cmd --permanent --list-all

### open port
firewall-cmd --add-port=9092/tcp --permanent --zone=public
firewall-cmd --reload
firewall-cmd --list-ports

### iptables
iptables -A IN_public_allow -p tcp -m tcp --dport 1989 -m conntrack --ctstate NEW -j ACCEPT
iptables-save > /etc/sysconfig/iptables
iptables-restore < /etc/sysconfig/iptables

iptables -A *****
iptables -D *****

### find ssh connect
netstat -tnpa | grep 'ESTABLISHED.*sshd' | wc -l

### ssh connection limit
grep MaxStartups /etc/ssh/sshd_config

### network port 
IANA has divided ipv4 port number into three ranges:
0-1023 : system or well-known ports
1024-49151: user or registered ports
49152-65535: dynamic/private/ephemeral ports

### selinux
getenforce
setenforce
setstatus

### sar 
sar -n DEV 1

### ssh restart
systemctl restart sshd.service  

### check network speed
nload then up and down

### commands
 * ip
 * ifconfig
 * host
 * whois
 * ping
 * traceroute
 * ssh
 * telnet
 * scp
 * sftp
 * ftp
 * wget
