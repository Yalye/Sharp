### network bandwidth speed
iftop 
or
curl -s https://raw.githubusercontent.com/sivel/speedtest-cli/master/speedtest.py | python -

### open port to one specific ip
firewall-cmd --permanent --add-rich-rule="rule family="ipv4" source address="1.1.1.1" port protocol="tcp" port="8888" accept"

firewall-cmd --permanent --remove-rich-rule="rule family="ipv4" source address="192.168.11.151" port protocol="tcp" port="8887" accept"

firewall-cmd --reload
firewall-cmd --permanent --list-all

### find ssh connect
netstat -tnpa | grep 'ESTABLISHED.*sshd' | wc -l

### ssh connection limit
grep MaxStartups /etc/ssh/sshd_config

