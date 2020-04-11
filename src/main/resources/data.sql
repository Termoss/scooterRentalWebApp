INSERT INTO public.scooter_dock(id, available_place, dock_name) VALUES
(1,10,'zachodni'),
(2,1,'zachodni'),
(3,10,'zachodni'),
(4,10,'zachodni'),
(5,10,'zachodni'),
(6,10,'zachodni'),
(7,10,'zachodni');

INSERT INTO public.scooter(id, max_speed, model_name, rental_price, scooter_dock_id, user_account_id) VALUES
(5,25,'ERE-321', 19.11,1,null),
(6,25,'ERE-321', 33.11,1,null),
(7,25,'ERE-321', 22.11,1,null),
(8,25,'ERE-321', 19.11,1,null),
(9,25,'ERE-321', 22.11,1,null),
(10,25,'ERE-321', 19.11,1,null),
(11,25,'ERE-321', 19.11,1,null);

SELECT  setval('public.hibernate_sequence',15,true);