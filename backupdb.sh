crontab - e

00 *** /backupdb.sh

#!/bin/bash
date=$(date '+%Y-%m-%d')
PGPASSWORD="**_PASSWORD_**" pg_dump --host 127.0.0.1 --port 5432 -U **postges** --format custom --blobs --verbose --file "DB_backup_$date.bck" **BDS_project**